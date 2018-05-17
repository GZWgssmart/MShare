package top.zywork.query;

public class UserPayPasswordQuery extends BaseQuery {
    private static final long serialVersionUID = -488112223478331554L;

    private Long id;
    private String payPassword;

    public UserPayPasswordQuery() {}

    public UserPayPasswordQuery(Long id, String payPassword) {
        this.id = id;
        this.payPassword = payPassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }
}
