package top.zywork.vo;

public class SmsCodeVO extends BaseVO {
    private static final long serialVersionUID = 6056185106934988259L;

    private String ip;
    private String phone;
    private String code;

    public SmsCodeVO() {}

    public SmsCodeVO(String ip, String phone, String code) {
        this.ip = ip;
        this.phone = phone;
        this.code = code;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
