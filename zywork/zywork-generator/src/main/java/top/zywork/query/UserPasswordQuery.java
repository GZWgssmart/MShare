package top.zywork.query;

public class UserPasswordQuery extends BaseQuery {
    private static final long serialVersionUID = -488112223478331554L;

    private Long id;
    private String password;

    public UserPasswordQuery() {}

    public UserPasswordQuery(Long id, String password) {
        this.id = id;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
