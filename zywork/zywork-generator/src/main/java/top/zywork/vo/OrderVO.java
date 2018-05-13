package top.zywork.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * OrderVO值对象类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class OrderVO extends BaseVO {

    private static final long serialVersionUID = -9223372035856644783L;

    /**
	 * 编号
	 */
	private Long id;
	/**
	 * 订单编号
	 */
	// @NotBlank(message = "此项是必须项")
	private String orderNo;
	/**
	 * 订单总额
	 */
	// @NotNull(message = "此项是必须项")
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
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 订单状态
	 */
	private Integer status;
	/**
	 * 卖出确认时间
	 */
	private Date sellConfirmTime;
	/**
	 * 买入确认时间
	 */
	private Date buyConfirmTime;
	/**
	 * 成交时间
	 */
	private Date dealTime;
	
    public OrderVO () {}

    public OrderVO (Long id, String orderNo, Long total, Integer type, Long sellId, Long buyId, Date createTime, Date updateTime, Integer status, Date sellConfirmTime, Date buyConfirmTime, Date dealTime) {
        this.id = id;
		this.orderNo = orderNo;
		this.total = total;
		this.type = type;
		this.sellId = sellId;
		this.buyId = buyId;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.status = status;
		this.sellConfirmTime = sellConfirmTime;
		this.buyConfirmTime = buyConfirmTime;
		this.dealTime = dealTime;
		
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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

	public Date getBuyConfirmTime() {
		return buyConfirmTime;
	}

	public void setBuyConfirmTime(Date buyConfirmTime) {
		this.buyConfirmTime = buyConfirmTime;
	}

	public Date getDealTime() {
		return dealTime;
	}

	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}

	
    @Override
    public String toString() {
        return "OrderDO{" +
                "id = " + id + 
				", orderNo = " + orderNo + 
				", total = " + total + 
				", type = " + type + 
				", sellId = " + sellId + 
				", buyId = " + buyId + 
				", createTime = " + createTime + 
				", updateTime = " + updateTime + 
				", status = " + status + 
				", sellConfirmTime = " + sellConfirmTime + 
				", buyConfirmTime = " + buyConfirmTime + 
				", dealTime = " + dealTime + 
				"}";
    }

}
