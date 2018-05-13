package top.zywork.query;

public class UserOrderQuery extends BaseQuery {

    private static final long serialVersionUID = -6121590672902605198L;
    private Long id;
    private Long total;

    public UserOrderQuery() {}

    public UserOrderQuery(Long id, Long total) {
        this.id = id;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
