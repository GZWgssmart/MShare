package top.zywork.dos;

import java.util.Date;

/**
 * TransDO数据对象实体类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class TransDO extends BaseDO {

    private static final long serialVersionUID = -9223372034998683866L;

    /**
	 * 编号
	 */
	private Long id;
	/**
	 * 转出人编号
	 */
	private Long transFrom;
	/**
	 * 转入人编号
	 */
	private Long transTo;
	/**
	 * 金额
	 */
	private Long total;
	/**
	 * 转入时间
	 */
	private Date transTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private String updateTime;

	private String fromNickname;
	private String fromPhone;
	private String toNickname;
	private String toPhone;
	
    public TransDO () {}

    public TransDO (Long id, Long transFrom, Long transTo, Long total, Date transTime, Date createTime, String updateTime) {
        this.id = id;
		this.transFrom = transFrom;
		this.transTo = transTo;
		this.total = total;
		this.transTime = transTime;
		this.createTime = createTime;
		this.updateTime = updateTime;
		
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTransFrom() {
		return transFrom;
	}

	public void setTransFrom(Long transFrom) {
		this.transFrom = transFrom;
	}

	public Long getTransTo() {
		return transTo;
	}

	public void setTransTo(Long transTo) {
		this.transTo = transTo;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Date getTransTime() {
		return transTime;
	}

	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getFromNickname() {
		return fromNickname;
	}

	public void setFromNickname(String fromNickname) {
		this.fromNickname = fromNickname;
	}

	public String getFromPhone() {
		return fromPhone;
	}

	public void setFromPhone(String fromPhone) {
		this.fromPhone = fromPhone;
	}

	public String getToNickname() {
		return toNickname;
	}

	public void setToNickname(String toNickname) {
		this.toNickname = toNickname;
	}

	public String getToPhone() {
		return toPhone;
	}

	public void setToPhone(String toPhone) {
		this.toPhone = toPhone;
	}

	@Override
    public String toString() {
        return "TransDO{" +
                "id = " + id + 
				", transFrom = " + transFrom + 
				", transTo = " + transTo + 
				", total = " + total + 
				", transTime = " + transTime + 
				", createTime = " + createTime + 
				", updateTime = " + updateTime + 
				"}";
    }

}
