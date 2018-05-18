package top.zywork.sms;

import top.zywork.common.RandomUtils;

public class SendPost {

    public static void main(String[] args) {
        String params = "action=" + SmsConstant.ACTION_SEND
                + "&account=" + SmsConstant.ACCOUNT
                + "&password=" + SmsConstant.PASSWORD
                + "&mobile=13672297775"
                + "&content=" + SmsConstant.SMS_CODE.replace("{code}", RandomUtils.randomNum(100000, 999999) + "")
                + "&extno=" + SmsConstant.EXT_NO
                + "&rt=" + SmsConstant.RESULT_TYPE;
        String sr=SendSms.sendPost(SmsConstant.HOST, params);
        System.out.println(sr);
    }

}
