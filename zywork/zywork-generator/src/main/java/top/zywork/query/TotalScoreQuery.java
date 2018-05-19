package top.zywork.query;

import java.util.Date;

/**
 * TotalScoreQuery查询对象类<br/>
 *
 * 创建于2018-05-19<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class TotalScoreQuery extends BaseQuery {

    private static final long serialVersionUID = -9223372035953908784L;

    /**
	 * 编号
	 */
	private Long id;
	/**
	 * 用户编号
	 */
	private Long userId;
	/**
	 * 兑换数额
	 */
	private Long total;
	/**
	 * 兑换积分
	 */
	private Long score;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 创建时间(开始)
	 */
	private Date createTimeStart;
	/**
	 * 创建时间(结束)
	 */
	private Date createTimeEnd;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 更新时间(开始)
	 */
	private Date updateTimeStart;
	/**
	 * 更新时间(结束)
	 */
	private Date updateTimeEnd;
	
    public TotalScoreQuery() {}

    public TotalScoreQuery(Long id, Long userId, Long total, Long score, Date createTime, Date createTimeStart, Date createTimeEnd, Date updateTime, Date updateTimeStart, Date updateTimeEnd) {
        this.id = id;
		this.userId = userId;
		this.total = total;
		this.score = score;
		this.createTime = createTime;
		this.createTimeStart = createTimeStart;
		this.createTimeEnd = createTimeEnd;
		this.updateTime = updateTime;
		this.updateTimeStart = updateTimeStart;
		this.updateTimeEnd = updateTimeEnd;
		
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTimeStart() {
		return createTimeStart;
	}

	public void setCreateTimeStart(Date createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public Date getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(Date createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTimeStart() {
		return updateTimeStart;
	}

	public void setUpdateTimeStart(Date updateTimeStart) {
		this.updateTimeStart = updateTimeStart;
	}

	public Date getUpdateTimeEnd() {
		return updateTimeEnd;
	}

	public void setUpdateTimeEnd(Date updateTimeEnd) {
		this.updateTimeEnd = updateTimeEnd;
	}

	
    @Override
    public String toString() {
        return "TotalScoreDO{" +
                "}";
    }

}
