package top.zywork.query;

import java.util.Date;

/**
 * UserBonusQuery查询对象类<br/>
 *
 * 创建于2018-05-17<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class UserBonusQuery extends BaseQuery {

    private static final long serialVersionUID = -9223372035343880929L;

    //t_bonus_accounts表的字段对应的属性
	/**
	 * 编号
	 */
	private Long bonusAccountsId;
	/**
	 * 用户编号
	 */
	private Long bonusAccountsUid;
	/**
	 * 奖励名称
	 */
	private String bonusAccountsBonusName;
	/**
	 * 奖励额
	 */
	private Long bonusAccountsTotal;
	/**
	 * 更新时间
	 */
	private Date bonusAccountsUpdatedDate;
	/**
	 * 更新时间(开始)
	 */
	private Date bonusAccountsUpdatedDateStart;
	/**
	 * 更新时间(结束)
	 */
	private Date bonusAccountsUpdatedDateEnd;
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
	
    public UserBonusQuery () {}

    public UserBonusQuery (Long bonusAccountsId, Long bonusAccountsUid, String bonusAccountsBonusName, Long bonusAccountsTotal, Date bonusAccountsUpdatedDate, Date bonusAccountsUpdatedDateStart, Date bonusAccountsUpdatedDateEnd, Long userId, String userPhone, String userNickname, String userHeadicon) {
        this.bonusAccountsId = bonusAccountsId;
		this.bonusAccountsUid = bonusAccountsUid;
		this.bonusAccountsBonusName = bonusAccountsBonusName;
		this.bonusAccountsTotal = bonusAccountsTotal;
		this.bonusAccountsUpdatedDate = bonusAccountsUpdatedDate;
		this.bonusAccountsUpdatedDateStart = bonusAccountsUpdatedDateStart;
		this.bonusAccountsUpdatedDateEnd = bonusAccountsUpdatedDateEnd;
		this.userId = userId;
		this.userPhone = userPhone;
		this.userNickname = userNickname;
		this.userHeadicon = userHeadicon;
		
    }

    public Long getBonusAccountsId() {
		return bonusAccountsId;
	}

	public void setBonusAccountsId(Long bonusAccountsId) {
		this.bonusAccountsId = bonusAccountsId;
	}

	public Long getBonusAccountsUid() {
		return bonusAccountsUid;
	}

	public void setBonusAccountsUid(Long bonusAccountsUid) {
		this.bonusAccountsUid = bonusAccountsUid;
	}

	public String getBonusAccountsBonusName() {
		return bonusAccountsBonusName;
	}

	public void setBonusAccountsBonusName(String bonusAccountsBonusName) {
		this.bonusAccountsBonusName = bonusAccountsBonusName;
	}

	public Long getBonusAccountsTotal() {
		return bonusAccountsTotal;
	}

	public void setBonusAccountsTotal(Long bonusAccountsTotal) {
		this.bonusAccountsTotal = bonusAccountsTotal;
	}

	public Date getBonusAccountsUpdatedDate() {
		return bonusAccountsUpdatedDate;
	}

	public void setBonusAccountsUpdatedDate(Date bonusAccountsUpdatedDate) {
		this.bonusAccountsUpdatedDate = bonusAccountsUpdatedDate;
	}

	public Date getBonusAccountsUpdatedDateStart() {
		return bonusAccountsUpdatedDateStart;
	}

	public void setBonusAccountsUpdatedDateStart(Date bonusAccountsUpdatedDateStart) {
		this.bonusAccountsUpdatedDateStart = bonusAccountsUpdatedDateStart;
	}

	public Date getBonusAccountsUpdatedDateEnd() {
		return bonusAccountsUpdatedDateEnd;
	}

	public void setBonusAccountsUpdatedDateEnd(Date bonusAccountsUpdatedDateEnd) {
		this.bonusAccountsUpdatedDateEnd = bonusAccountsUpdatedDateEnd;
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
        return "UserBonusDO{" +
                "}";
    }

}
