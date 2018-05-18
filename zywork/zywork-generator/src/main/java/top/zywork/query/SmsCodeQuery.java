package top.zywork.query;

public class SmsCodeQuery extends BaseQuery {
    private static final long serialVersionUID = -508612980494268239L;

    private String ip;
    private String phone;

    public SmsCodeQuery() {}

    public SmsCodeQuery(String ip, String phone) {
        this.ip = ip;
        this.phone = phone;
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
}
