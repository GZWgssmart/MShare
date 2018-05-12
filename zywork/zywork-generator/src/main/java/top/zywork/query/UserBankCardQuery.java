package top.zywork.query;

import java.util.Date;

/**
 * UserBankCardQuery查询对象类<br/>
 *
 * 创建于2018-05-10<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class UserBankCardQuery extends BaseQuery {

    private static final long serialVersionUID = -9223372036055567048L;

    //t_bank_card表的字段对应的属性
	/**
	 * 编号
	 */
	private Long bankCardId;
	/**
	 * 银行
	 */
	private String bankCardBankName;
	/**
	 * 银行卡号
	 */
	private String bankCardCardNo;
	/**
	 * 真实姓名
	 */
	private String bankCardRealName;
	/**
	 * 手机号
	 */
	private String bankCardPhone;
	/**
	 * 用户编号
	 */
	private Long bankCardUserId;
	/**
	 * 创建时间
	 */
	private Date bankCardCreateTime;
	/**
	 * 创建时间(开始)
	 */
	private Date bankCardCreateTimeStart;
	/**
	 * 创建时间(结束)
	 */
	private Date bankCardCreateTimeEnd;
	/**
	 * 更新时间
	 */
	private Date bankCardUpdateTime;
	/**
	 * 更新时间(开始)
	 */
	private Date bankCardUpdateTimeStart;
	/**
	 * 更新时间(结束)
	 */
	private Date bankCardUpdateTimeEnd;
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
	
    public UserBankCardQuery() {}

    public UserBankCardQuery(Long bankCardId, String bankCardBankName, String bankCardCardNo, String bankCardRealName, String bankCardPhone, Long bankCardUserId, Date bankCardCreateTime, Date bankCardCreateTimeStart, Date bankCardCreateTimeEnd, Date bankCardUpdateTime, Date bankCardUpdateTimeStart, Date bankCardUpdateTimeEnd, Long userId, String userPhone, String userNickname) {
        this.bankCardId = bankCardId;
		this.bankCardBankName = bankCardBankName;
		this.bankCardCardNo = bankCardCardNo;
		this.bankCardRealName = bankCardRealName;
		this.bankCardPhone = bankCardPhone;
		this.bankCardUserId = bankCardUserId;
		this.bankCardCreateTime = bankCardCreateTime;
		this.bankCardCreateTimeStart = bankCardCreateTimeStart;
		this.bankCardCreateTimeEnd = bankCardCreateTimeEnd;
		this.bankCardUpdateTime = bankCardUpdateTime;
		this.bankCardUpdateTimeStart = bankCardUpdateTimeStart;
		this.bankCardUpdateTimeEnd = bankCardUpdateTimeEnd;
		this.userId = userId;
		this.userPhone = userPhone;
		this.userNickname = userNickname;
		
    }

    public Long getBankCardId() {
		return bankCardId;
	}

	public void setBankCardId(Long bankCardId) {
		this.bankCardId = bankCardId;
	}

	public String getBankCardBankName() {
		return bankCardBankName;
	}

	public void setBankCardBankName(String bankCardBankName) {
		this.bankCardBankName = bankCardBankName;
	}

	public String getBankCardCardNo() {
		return bankCardCardNo;
	}

	public void setBankCardCardNo(String bankCardCardNo) {
		this.bankCardCardNo = bankCardCardNo;
	}

	public String getBankCardRealName() {
		return bankCardRealName;
	}

	public void setBankCardRealName(String bankCardRealName) {
		this.bankCardRealName = bankCardRealName;
	}

	public String getBankCardPhone() {
		return bankCardPhone;
	}

	public void setBankCardPhone(String bankCardPhone) {
		this.bankCardPhone = bankCardPhone;
	}

	public Long getBankCardUserId() {
		return bankCardUserId;
	}

	public void setBankCardUserId(Long bankCardUserId) {
		this.bankCardUserId = bankCardUserId;
	}

	public Date getBankCardCreateTime() {
		return bankCardCreateTime;
	}

	public void setBankCardCreateTime(Date bankCardCreateTime) {
		this.bankCardCreateTime = bankCardCreateTime;
	}

	public Date getBankCardCreateTimeStart() {
		return bankCardCreateTimeStart;
	}

	public void setBankCardCreateTimeStart(Date bankCardCreateTimeStart) {
		this.bankCardCreateTimeStart = bankCardCreateTimeStart;
	}

	public Date getBankCardCreateTimeEnd() {
		return bankCardCreateTimeEnd;
	}

	public void setBankCardCreateTimeEnd(Date bankCardCreateTimeEnd) {
		this.bankCardCreateTimeEnd = bankCardCreateTimeEnd;
	}

	public Date getBankCardUpdateTime() {
		return bankCardUpdateTime;
	}

	public void setBankCardUpdateTime(Date bankCardUpdateTime) {
		this.bankCardUpdateTime = bankCardUpdateTime;
	}

	public Date getBankCardUpdateTimeStart() {
		return bankCardUpdateTimeStart;
	}

	public void setBankCardUpdateTimeStart(Date bankCardUpdateTimeStart) {
		this.bankCardUpdateTimeStart = bankCardUpdateTimeStart;
	}

	public Date getBankCardUpdateTimeEnd() {
		return bankCardUpdateTimeEnd;
	}

	public void setBankCardUpdateTimeEnd(Date bankCardUpdateTimeEnd) {
		this.bankCardUpdateTimeEnd = bankCardUpdateTimeEnd;
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

	
    @Override
    public String toString() {
        return "UserBankCardDO{" +
                "}";
    }

}
