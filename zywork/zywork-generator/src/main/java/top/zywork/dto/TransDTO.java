package top.zywork.dto;

import java.util.Date;

/**
 * TransDTO数据传输对象类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class TransDTO extends BaseDTO {

    private static final long serialVersionUID = -9223372035666808122L;

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
	
    public TransDTO () {}

    public TransDTO (Long id, Long transFrom, Long transTo, Long total, Date transTime, Date createTime, String updateTime) {
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
