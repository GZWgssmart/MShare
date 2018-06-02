package top.zywork.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.zywork.common.EncryptUtils;
import top.zywork.common.IPUtils;
import top.zywork.common.RandomUtils;
import top.zywork.dto.UserDTO;
import top.zywork.enums.RandomCodeEnum;
import top.zywork.query.SmsCodeQuery;
import top.zywork.service.SmsService;
import top.zywork.service.UserService;
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

    private UserService userService;

    @PostMapping("send")
    @ResponseBody
    public ControllerStatusVO send(String phone, HttpServletRequest request) {
        String ip = IPUtils.getIP(request);
        SmsCodeVO smsCodeVO = smsService.getSmsCode(SmsConstant.CODE_PREFIX, new SmsCodeQuery(ip, phone));
        ControllerStatusVO statusVO = new ControllerStatusVO();
        if (userService.getByPhone(phone) != null) {
            statusVO.errorStatus(500, "此手机号已注册");
        } else {
            if (smsCodeVO == null) {
                String code = RandomUtils.randomNum(100000, 999999) + "";
                String params = getSmsParams(phone, SmsConstant.SMS_CODE, code);
                logger.info("begin to send sms......");
                String result = SendSms.sendPost(SmsConstant.HOST, params);
                logger.info("sms send result: {}", result);
                if (result.contains("\"status\":\"0\"") && result.contains("\"result\":0")) {
                    smsService.saveSmsCode(SmsConstant.CODE_PREFIX, new SmsCodeVO(ip, phone, code));
                    statusVO.okStatus(200, "验证码发送成功，请及时查收，" + SmsConstant.VALID_TIME + "分钟内有效");
                } else {
                    statusVO.errorStatus(500, "暂时无法发送短信验证码，请稍候再尝试");
                    logger.error("短信发送失败，返回结果：{}", result);
                }
            } else {
                statusVO.errorStatus(500, "您已经获取过了验证码，请" + SmsConstant.VALID_TIME + "分钟后再尝试");
            }
        }
        return statusVO;
    }

    @PostMapping("pwd")
    @ResponseBody
    public ControllerStatusVO pwd(String phone, HttpServletRequest request) {
        String ip = IPUtils.getIP(request);
        SmsCodeVO smsCodeVO = smsService.getSmsCode(SmsConstant.PWD_PREFIX, new SmsCodeQuery(ip, phone));
        ControllerStatusVO statusVO = new ControllerStatusVO();
        if (userService.getByPhone(phone) == null) {
            statusVO.errorStatus(500, "此手机号未注册");
        } else {
            if (smsCodeVO == null) {
                String code = RandomUtils.randomNum(100000, 999999) + "";
                String params = getSmsParams(phone, SmsConstant.SMS_PWD, code);
                logger.info("begin to send pwd sms......");
                String result = SendSms.sendPost(SmsConstant.HOST, params);
                logger.info("sms send result: {}", result);
                if (result.contains("\"status\":\"0\"") && result.contains("\"result\":0")) {
                    smsService.saveSmsCode(SmsConstant.PWD_PREFIX, new SmsCodeVO(ip, phone, code));
                    statusVO.okStatus(200, "验证码发送成功，请及时查收，" + SmsConstant.VALID_TIME + "分钟内有效");
                } else {
                    statusVO.errorStatus(500, "暂时无法发送短信验证码，请稍候再尝试");
                    logger.error("短信发送失败，返回结果：{}", result);
                }
            } else {
                statusVO.errorStatus(500, "您已经获取过了验证码，请" + SmsConstant.VALID_TIME + "分钟后再尝试");
            }
        }
        return statusVO;
    }

    @PostMapping("new-pwd")
    @ResponseBody
    public ControllerStatusVO newPwd(String phone, String verifyCode,  HttpServletRequest request) {
        String ip = IPUtils.getIP(request);
        ControllerStatusVO statusVO = new ControllerStatusVO();
        SmsCodeVO smsCodeVO = smsService.getSmsCode(SmsConstant.PWD_PREFIX, new SmsCodeQuery(ip, phone));
        if (verifyCode != null && verifyCode.equals(smsCodeVO.getCode())) {
            String code = RandomUtils.randomCode(RandomCodeEnum.MIX_CODE, 6);
            String params = getSmsParams(phone, SmsConstant.SMS_NEW_PWD, code);
            logger.info("begin to send new pwd sms......");
            String result = SendSms.sendPost(SmsConstant.HOST, params);
            logger.info("sms send result: {}", result);
            if (result.contains("\"status\":\"0\"") && result.contains("\"result\":0")) {
                UserDTO userDTO = (UserDTO) userService.getByPhone(phone);
                userDTO.setPassword(EncryptUtils.md5(code));
                userService.update(userDTO);
                statusVO.okStatus(200, "已成功修改登录密码，请手机查收新登录密码");
            } else {
                statusVO.errorStatus(500, "暂时无法发送短信验证码，请稍候再尝试");
                logger.error("短信发送失败，返回结果：{}", result);
            }
        } else {
            statusVO.errorStatus(500, "输入的验证码不正确");
            logger.error("输入的验证码不正确");
        }
        return statusVO;
    }

    private String getSmsParams(String phone, String smsTpl, String code) {
        String content = null;
        try {
            content = URLEncoder.encode(smsTpl.replace("{code}", code), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "action=" + SmsConstant.ACTION_SEND
                + "&account=" + SmsConstant.ACCOUNT
                + "&password=" + SmsConstant.PASSWORD
                + "&mobile=" + phone
                + "&content=" + content
                + "&extno=" + SmsConstant.EXT_NO
                + "&rt=" + SmsConstant.RESULT_TYPE;
    }

    @Autowired
    public void setSmsService(SmsService smsService) {
        this.smsService = smsService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
