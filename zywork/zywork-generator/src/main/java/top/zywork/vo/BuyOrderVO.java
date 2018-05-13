package top.zywork.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * UserBuyOrderVO值对象类<br/>
 *
 * 创建于2018-05-12<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class BuyOrderVO extends BaseVO {

    private static final long serialVersionUID = -9223372035063553260L;

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
	//t_order表的字段对应的属性
	/**
	 * 编号
	 */
	private Long orderId;
	/**
	 * 订单编号
	 */
	// @NotBlank(message = "此项是必须项")
	private String orderOrderNo;
	/**
	 * 订单总额
	 */
	// @NotNull(message = "此项是必须项")
	private Long orderTotal;
	/**
	 * 订单类型
	 */
	private Integer orderType;
	/**
	 * 卖出人编号
	 */
	private Long orderSellId;
	/**
	 * 买入人编号
	 */
	private Long orderBuyId;
	/**
	 * 创建时间
	 */
	private Date orderCreateTime;
	/**
	 * 更新时间
	 */
	private Date orderUpdateTime;
	/**
	 * 订单状态
	 */
	private Integer orderStatus;
	/**
	 * 卖出确认时间
	 */
	private Date orderSellConfirmTime;
	/**
	 * 买入确认时间
	 */
	private Date orderBuyConfirmTime;
	/**
	 * 成交时间
	 */
	private Date orderDealTime;

	private String sellUserId;
	private String sellHeadicon;
	private String sellNickname;
	private String sellPhone;
	
    public BuyOrderVO() {}

    public BuyOrderVO(Long userId, String userPhone, String userNickname, String userHeadicon, Long orderId, String orderOrderNo, Long orderTotal, Integer orderType, Long orderSellId, Long orderBuyId, Date orderCreateTime, Date orderUpdateTime, Integer orderStatus, Date orderSellConfirmTime, Date orderBuyConfirmTime, Date orderDealTime) {
        this.userId = userId;
		this.userPhone = userPhone;
		this.userNickname = userNickname;
		this.userHeadicon = userHeadicon;
		this.orderId = orderId;
		this.orderOrderNo = orderOrderNo;
		this.orderTotal = orderTotal;
		this.orderType = orderType;
		this.orderSellId = orderSellId;
		this.orderBuyId = orderBuyId;
		this.orderCreateTime = orderCreateTime;
		this.orderUpdateTime = orderUpdateTime;
		this.orderStatus = orderStatus;
		this.orderSellConfirmTime = orderSellConfirmTime;
		this.orderBuyConfirmTime = orderBuyConfirmTime;
		this.orderDealTime = orderDealTime;
		
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

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderOrderNo() {
		return orderOrderNo;
	}

	public void setOrderOrderNo(String orderOrderNo) {
		this.orderOrderNo = orderOrderNo;
	}

	public Long getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Long orderTotal) {
		this.orderTotal = orderTotal;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Long getOrderSellId() {
		return orderSellId;
	}

	public void setOrderSellId(Long orderSellId) {
		this.orderSellId = orderSellId;
	}

	public Long getOrderBuyId() {
		return orderBuyId;
	}

	public void setOrderBuyId(Long orderBuyId) {
		this.orderBuyId = orderBuyId;
	}

	public Date getOrderCreateTime() {
		return orderCreateTime;
	}

	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderUpdateTime() {
		return orderUpdateTime;
	}

	public void setOrderUpdateTime(Date orderUpdateTime) {
		this.orderUpdateTime = orderUpdateTime;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderSellConfirmTime() {
		return orderSellConfirmTime;
	}

	public void setOrderSellConfirmTime(Date orderSellConfirmTime) {
		this.orderSellConfirmTime = orderSellConfirmTime;
	}

	public Date getOrderBuyConfirmTime() {
		return orderBuyConfirmTime;
	}

	public void setOrderBuyConfirmTime(Date orderBuyConfirmTime) {
		this.orderBuyConfirmTime = orderBuyConfirmTime;
	}

	public Date getOrderDealTime() {
		return orderDealTime;
	}

	public void setOrderDealTime(Date orderDealTime) {
		this.orderDealTime = orderDealTime;
	}

	public String getSellUserId() {
		return sellUserId;
	}

	public void setSellUserId(String sellUserId) {
		this.sellUserId = sellUserId;
	}

	public String getSellHeadicon() {
		return sellHeadicon;
	}

	public void setSellHeadicon(String sellHeadicon) {
		this.sellHeadicon = sellHeadicon;
	}

	public String getSellNickname() {
		return sellNickname;
	}

	public void setSellNickname(String sellNickname) {
		this.sellNickname = sellNickname;
	}

	public String getSellPhone() {
		return sellPhone;
	}

	public void setSellPhone(String sellPhone) {
		this.sellPhone = sellPhone;
	}

	@Override
    public String toString() {
        return "BuyOrderDO{" +
                "userId = " + userId + 
				", userPhone = " + userPhone + 
				", userNickname = " + userNickname + 
				", userHeadicon = " + userHeadicon + 
				", orderId = " + orderId + 
				", orderOrderNo = " + orderOrderNo + 
				", orderTotal = " + orderTotal + 
				", orderType = " + orderType + 
				", orderSellId = " + orderSellId + 
				", orderBuyId = " + orderBuyId + 
				", orderCreateTime = " + orderCreateTime + 
				", orderUpdateTime = " + orderUpdateTime + 
				", orderStatus = " + orderStatus + 
				", orderSellConfirmTime = " + orderSellConfirmTime + 
				", orderBuyConfirmTime = " + orderBuyConfirmTime + 
				", orderDealTime = " + orderDealTime + 
				"}";
    }

}
