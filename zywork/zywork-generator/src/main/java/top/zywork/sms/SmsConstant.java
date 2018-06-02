package top.zywork.sms;

public class SmsConstant {

    public static final String HOST = "http://47.100.188.160:7862/sms";

    public static final int VALID_TIME = 10;

    public static final String ACCOUNT = "922111";
    public static final String PASSWORD = "iAG8cr";

    public static final String EXT_NO = "10690111";

    public static final String RESULT_TYPE = "json";

    public static final String ACTION_SEND = "send";

    public static final String CODE_PREFIX = "code:";
    public static final String PWD_PREFIX = "pwd:";

    public static final String SMS_CODE = "【瑞信宝】注册验证码：{code}，" + VALID_TIME + "分钟内有效";

    public static final String SMS_PWD = "【瑞信宝】修改登录密码验证码：{code}，" + VALID_TIME + "分钟内有效";


    public static final String SMS_NEW_PWD = "【瑞信宝】您已成功修改登录密码为：{code}，请使用新密码登录，注意大小写一致";

}
