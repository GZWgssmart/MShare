package top.zywork.dto;

import java.util.Date;

/**
 * BankCardDTO数据传输对象类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class BankCardDTO extends BaseDTO {

    private static final long serialVersionUID = -9223372034957935564L;

    /**
	 * 编号
	 */
	private Long id;
	/**
	 * 银行
	 */
	private String bankName;
	/**
	 * 银行卡号
	 */
	private String cardNo;
	/**
	 * 真实姓名
	 */
	private String realName;
	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * 用户编号
	 */
	private Long userId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
    public BankCardDTO () {}

    public BankCardDTO (Long id, String bankName, String cardNo, String realName, String phone, Long userId, Date createTime, Date updateTime) {
        this.id = id;
		this.bankName = bankName;
		this.cardNo = cardNo;
		this.realName = realName;
		this.phone = phone;
		this.userId = userId;
		this.createTime = createTime;
		this.updateTime = updateTime;
		
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
        return "BankCardDO{" +
                "id = " + id + 
				", bankName = " + bankName + 
				", cardNo = " + cardNo + 
				", realName = " + realName + 
				", phone = " + phone + 
				", userId = " + userId + 
				", createTime = " + createTime + 
				", updateTime = " + updateTime + 
				"}";
    }

}
