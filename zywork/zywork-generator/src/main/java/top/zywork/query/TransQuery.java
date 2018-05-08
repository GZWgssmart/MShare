package top.zywork.query;

import java.util.Date;

/**
 * TransQuery查询对象类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class TransQuery extends BaseQuery {

    private static final long serialVersionUID = -9223372035385352232L;

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
	 * 转入时间(开始)
	 */
	private Date transTimeStart;
	/**
	 * 转入时间(结束)
	 */
	private Date transTimeEnd;
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
	private String updateTime;
	
    public TransQuery () {}

    public TransQuery (Long id, Long transFrom, Long transTo, Long total, Date transTime, Date transTimeStart, Date transTimeEnd, Date createTime, Date createTimeStart, Date createTimeEnd, String updateTime) {
        this.id = id;
		this.transFrom = transFrom;
		this.transTo = transTo;
		this.total = total;
		this.transTime = transTime;
		this.transTimeStart = transTimeStart;
		this.transTimeEnd = transTimeEnd;
		this.createTime = createTime;
		this.createTimeStart = createTimeStart;
		this.createTimeEnd = createTimeEnd;
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

	public Date getTransTimeStart() {
		return transTimeStart;
	}

	public void setTransTimeStart(Date transTimeStart) {
		this.transTimeStart = transTimeStart;
	}

	public Date getTransTimeEnd() {
		return transTimeEnd;
	}

	public void setTransTimeEnd(Date transTimeEnd) {
		this.transTimeEnd = transTimeEnd;
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

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	
    @Override
    public String toString() {
        return "TransDO{" +
                "}";
    }

}
