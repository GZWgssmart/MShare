package top.zywork.query;

public class UserTotalAndScoreQuery extends BaseQuery {
    private static final long serialVersionUID = 1163048579055493368L;

    private Long id;
    private Long total;
    private Long score;

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
