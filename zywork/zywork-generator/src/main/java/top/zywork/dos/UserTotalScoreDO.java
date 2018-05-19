package top.zywork.dos;

import java.util.Date;

/**
 * UserTotalScoreDO数据对象实体类<br/>
 *
 * 创建于2018-05-19<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class UserTotalScoreDO extends BaseDO {

    private static final long serialVersionUID = -9223372035971964920L;

    //t_total_score表的字段对应的属性
	/**
	 * 编号
	 */
	private Long totalScoreId;
	/**
	 * 用户编号
	 */
	private Long totalScoreUserId;
	/**
	 * 兑换数额
	 */
	private Long totalScoreTotal;
	/**
	 * 兑换积分
	 */
	private Long totalScoreScore;
	/**
	 * 创建时间
	 */
	private Date totalScoreCreateTime;
	/**
	 * 更新时间
	 */
	private Date totalScoreUpdateTime;
	//t_user表的字段对应的属性
	/**
	 * 编号
	 */
	private Long userId;
	/**
	 * 手机号
	 */
	private String userPhone;
	/**
	 * 昵称
	 */
	private String userNickname;
	/**
	 * 头像地址
	 */
	private String userHeadicon;
	
    public UserTotalScoreDO() {}

    public UserTotalScoreDO(Long totalScoreId, Long totalScoreUserId, Long totalScoreTotal, Long totalScoreScore, Date totalScoreCreateTime, Date totalScoreUpdateTime, Long userId, String userPhone, String userNickname, String userHeadicon) {
        this.totalScoreId = totalScoreId;
		this.totalScoreUserId = totalScoreUserId;
		this.totalScoreTotal = totalScoreTotal;
		this.totalScoreScore = totalScoreScore;
		this.totalScoreCreateTime = totalScoreCreateTime;
		this.totalScoreUpdateTime = totalScoreUpdateTime;
		this.userId = userId;
		this.userPhone = userPhone;
		this.userNickname = userNickname;
		this.userHeadicon = userHeadicon;
		
    }

    public Long getTotalScoreId() {
		return totalScoreId;
	}

	public void setTotalScoreId(Long totalScoreId) {
		this.totalScoreId = totalScoreId;
	}

	public Long getTotalScoreUserId() {
		return totalScoreUserId;
	}

	public void setTotalScoreUserId(Long totalScoreUserId) {
		this.totalScoreUserId = totalScoreUserId;
	}

	public Long getTotalScoreTotal() {
		return totalScoreTotal;
	}

	public void setTotalScoreTotal(Long totalScoreTotal) {
		this.totalScoreTotal = totalScoreTotal;
	}

	public Long getTotalScoreScore() {
		return totalScoreScore;
	}

	public void setTotalScoreScore(Long totalScoreScore) {
		this.totalScoreScore = totalScoreScore;
	}

	public Date getTotalScoreCreateTime() {
		return totalScoreCreateTime;
	}

	public void setTotalScoreCreateTime(Date totalScoreCreateTime) {
		this.totalScoreCreateTime = totalScoreCreateTime;
	}

	public Date getTotalScoreUpdateTime() {
		return totalScoreUpdateTime;
	}

	public void setTotalScoreUpdateTime(Date totalScoreUpdateTime) {
		this.totalScoreUpdateTime = totalScoreUpdateTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserHeadicon() {
		return userHeadicon;
	}

	public void setUserHeadicon(String userHeadicon) {
		this.userHeadicon = userHeadicon;
	}

	
    @Override
    public String toString() {
        return "UserTotalScoreDO{" +
                "totalScoreId = " + totalScoreId + 
				", totalScoreUserId = " + totalScoreUserId + 
				", totalScoreTotal = " + totalScoreTotal + 
				", totalScoreScore = " + totalScoreScore + 
				", totalScoreCreateTime = " + totalScoreCreateTime + 
				", totalScoreUpdateTime = " + totalScoreUpdateTime + 
				", userId = " + userId + 
				", userPhone = " + userPhone + 
				", userNickname = " + userNickname + 
				", userHeadicon = " + userHeadicon + 
				"}";
    }

}
