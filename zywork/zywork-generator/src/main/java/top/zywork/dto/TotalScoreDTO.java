package top.zywork.dto;

import java.util.Date;

/**
 * TotalScoreDTO数据传输对象类<br/>
 *
 * 创建于2018-05-19<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class TotalScoreDTO extends BaseDTO {

    private static final long serialVersionUID = -9223372036142395893L;

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
	 * 更新时间
	 */
	private Date updateTime;
	
    public TotalScoreDTO() {}

    public TotalScoreDTO(Long id, Long userId, Long total, Long score, Date createTime, Date updateTime) {
        this.id = id;
		this.userId = userId;
		this.total = total;
		this.score = score;
		this.createTime = createTime;
		this.updateTime = updateTime;
		
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	
    @Override
    public String toString() {
        return "TotalScoreDO{" +
                "id = " + id + 
				", userId = " + userId + 
				", total = " + total + 
				", score = " + score + 
				", createTime = " + createTime + 
				", updateTime = " + updateTime + 
				"}";
    }

}
