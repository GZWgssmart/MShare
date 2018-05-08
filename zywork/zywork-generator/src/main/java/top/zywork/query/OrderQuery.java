package top.zywork.query;

import java.util.Date;

/**
 * OrderQuery查询对象类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class OrderQuery extends BaseQuery {

    private static final long serialVersionUID = -9223372035093304892L;

    /**
	 * 编号
	 */
	private Long id;
	/**
	 * 订单编号
	 */
	private String orderNo;
	/**
	 * 订单总额
	 */
	private Long total;
	/**
	 * 订单类型
	 */
	private Integer type;
	/**
	 * 卖出人编号
	 */
	private Long sellId;
	/**
	 * 买入人编号
	 */
	private Long buyId;
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
	/**
	 * 订单状态
	 */
	private Integer status;
	/**
	 * 卖出确认时间
	 */
	private Date sellConfirmTime;
	/**
	 * 卖出确认时间(开始)
	 */
	private Date sellConfirmTimeStart;
	/**
	 * 卖出确认时间(结束)
	 */
	private Date sellConfirmTimeEnd;
	/**
	 * 买入确认时间
	 */
	private Date buyConfirmTime;
	/**
	 * 买入确认时间(开始)
	 */
	private Date buyConfirmTimeStart;
	/**
	 * 买入确认时间(结束)
	 */
	private Date buyConfirmTimeEnd;
	/**
	 * 成交时间
	 */
	private Date dealTime;
	/**
	 * 成交时间(开始)
	 */
	private Date dealTimeStart;
	/**
	 * 成交时间(结束)
	 */
	private Date dealTimeEnd;
	
    public OrderQuery () {}

    public OrderQuery (Long id, String orderNo, Long total, Integer type, Long sellId, Long buyId, Date createTime, Date createTimeStart, Date createTimeEnd, Date updateTime, Date updateTimeStart, Date updateTimeEnd, Integer status, Date sellConfirmTime, Date sellConfirmTimeStart, Date sellConfirmTimeEnd, Date buyConfirmTime, Date buyConfirmTimeStart, Date buyConfirmTimeEnd, Date dealTime, Date dealTimeStart, Date dealTimeEnd) {
        this.id = id;
		this.orderNo = orderNo;
		this.total = total;
		this.type = type;
		this.sellId = sellId;
		this.buyId = buyId;
		this.createTime = createTime;
		this.createTimeStart = createTimeStart;
		this.createTimeEnd = createTimeEnd;
		this.updateTime = updateTime;
		this.updateTimeStart = updateTimeStart;
		this.updateTimeEnd = updateTimeEnd;
		this.status = status;
		this.sellConfirmTime = sellConfirmTime;
		this.sellConfirmTimeStart = sellConfirmTimeStart;
		this.sellConfirmTimeEnd = sellConfirmTimeEnd;
		this.buyConfirmTime = buyConfirmTime;
		this.buyConfirmTimeStart = buyConfirmTimeStart;
		this.buyConfirmTimeEnd = buyConfirmTimeEnd;
		this.dealTime = dealTime;
		this.dealTimeStart = dealTimeStart;
		this.dealTimeEnd = dealTimeEnd;
		
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getSellId() {
		return sellId;
	}

	public void setSellId(Long sellId) {
		this.sellId = sellId;
	}

	public Long getBuyId() {
		return buyId;
	}

	public void setBuyId(Long buyId) {
		this.buyId = buyId;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getSellConfirmTime() {
		return sellConfirmTime;
	}

	public void setSellConfirmTime(Date sellConfirmTime) {
		this.sellConfirmTime = sellConfirmTime;
	}

	public Date getSellConfirmTimeStart() {
		return sellConfirmTimeStart;
	}

	public void setSellConfirmTimeStart(Date sellConfirmTimeStart) {
		this.sellConfirmTimeStart = sellConfirmTimeStart;
	}

	public Date getSellConfirmTimeEnd() {
		return sellConfirmTimeEnd;
	}

	public void setSellConfirmTimeEnd(Date sellConfirmTimeEnd) {
		this.sellConfirmTimeEnd = sellConfirmTimeEnd;
	}

	public Date getBuyConfirmTime() {
		return buyConfirmTime;
	}

	public void setBuyConfirmTime(Date buyConfirmTime) {
		this.buyConfirmTime = buyConfirmTime;
	}

	public Date getBuyConfirmTimeStart() {
		return buyConfirmTimeStart;
	}

	public void setBuyConfirmTimeStart(Date buyConfirmTimeStart) {
		this.buyConfirmTimeStart = buyConfirmTimeStart;
	}

	public Date getBuyConfirmTimeEnd() {
		return buyConfirmTimeEnd;
	}

	public void setBuyConfirmTimeEnd(Date buyConfirmTimeEnd) {
		this.buyConfirmTimeEnd = buyConfirmTimeEnd;
	}

	public Date getDealTime() {
		return dealTime;
	}

	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}

	public Date getDealTimeStart() {
		return dealTimeStart;
	}

	public void setDealTimeStart(Date dealTimeStart) {
		this.dealTimeStart = dealTimeStart;
	}

	public Date getDealTimeEnd() {
		return dealTimeEnd;
	}

	public void setDealTimeEnd(Date dealTimeEnd) {
		this.dealTimeEnd = dealTimeEnd;
	}

	
    @Override
    public String toString() {
        return "OrderDO{" +
                "}";
    }

}
