package top.zywork.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.zywork.common.IPUtils;
import top.zywork.common.RandomUtils;
import top.zywork.query.SmsCodeQuery;
import top.zywork.service.SmsService;
import top.zywork.sms.SendSms;
import top.zywork.sms.SmsConstant;
import top.zywork.vo.ControllerStatusVO;
import top.zywork.vo.SmsCodeVO;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
@RequestMapping("/sms")
public class SmsController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(SmsController.class);

    private SmsService smsService;

    @PostMapping("send")
    @ResponseBody
    public ControllerStatusVO send(String phone, HttpServletRequest request) {
        String ip = IPUtils.getIP(request);
        SmsCodeVO smsCodeVO = smsService.getSmsCode(new SmsCodeQuery(ip, phone));
        ControllerStatusVO statusVO = new ControllerStatusVO();
        if (smsCodeVO == null) {
            try {
                String code = RandomUtils.randomNum(100000, 999999) + "";
                String content = URLEncoder.encode(SmsConstant.SMS_CODE.replace("{code}", code), "utf-8");
                String params = "action=" + SmsConstant.ACTION_SEND
                        + "&account=" + SmsConstant.ACCOUNT
                        + "&password=" + SmsConstant.PASSWORD
                        + "&mobile=" + phone
                        + "&content=" + content
                        + "&extno=" + SmsConstant.EXT_NO
                        + "&rt=" + SmsConstant.RESULT_TYPE;
                String result = SendSms.sendPost(SmsConstant.HOST, params);
                if (result.contains("\"status\":\"0\"") && result.contains("\"result\":0")) {
                    smsService.saveSmsCode(new SmsCodeVO(ip, phone, code));
                    statusVO.okStatus(200, "验证码发送成功，请及时查收，" + SmsConstant.VALID_TIME + "分钟内有效");
                } else {
                    statusVO.errorStatus(500, "暂时无法发送短信验证码，请稍候再尝试");
                    logger.error("短信发送失败，返回结果：{}", result);
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else {
            statusVO.errorStatus(500, "您已经获取了验证码，如未收到，请" + SmsConstant.VALID_TIME + "分钟后再尝试");
        }
        return statusVO;
    }

    @Autowired
    public void setSmsService(SmsService smsService) {
        this.smsService = smsService;
    }
}
