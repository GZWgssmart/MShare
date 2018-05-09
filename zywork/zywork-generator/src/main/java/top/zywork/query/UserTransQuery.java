package top.zywork.query;

public class UserTransQuery extends BaseQuery {

    private static final long serialVersionUID = -1938872381689034885L;
    private Long id;
    private Long total;
    private Long score;

    public UserTransQuery() {}

    public UserTransQuery(Long id, Long total, Long score) {
        this.id = id;
        this.total = total;
        this.score = score;
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

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }
}
