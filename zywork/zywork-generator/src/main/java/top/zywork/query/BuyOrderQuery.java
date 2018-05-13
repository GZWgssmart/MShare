package top.zywork.query;

import java.util.Date;

/**
 * UserBuyOrderQuery查询对象类<br/>
 *
 * 创建于2018-05-12<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class BuyOrderQuery extends BaseQuery {

    private static final long serialVersionUID = -9223372035402585621L;

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
	private String orderOrderNo;
	/**
	 * 订单总额
	 */
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
	 * 创建时间(开始)
	 */
	private Date orderCreateTimeStart;
	/**
	 * 创建时间(结束)
	 */
	private Date orderCreateTimeEnd;
	/**
	 * 更新时间
	 */
	private Date orderUpdateTime;
	/**
	 * 更新时间(开始)
	 */
	private Date orderUpdateTimeStart;
	/**
	 * 更新时间(结束)
	 */
	private Date orderUpdateTimeEnd;
	/**
	 * 订单状态
	 */
	private Integer orderStatus;
	/**
	 * 卖出确认时间
	 */
	private Date orderSellConfirmTime;
	/**
	 * 卖出确认时间(开始)
	 */
	private Date orderSellConfirmTimeStart;
	/**
	 * 卖出确认时间(结束)
	 */
	private Date orderSellConfirmTimeEnd;
	/**
	 * 买入确认时间
	 */
	private Date orderBuyConfirmTime;
	/**
	 * 买入确认时间(开始)
	 */
	private Date orderBuyConfirmTimeStart;
	/**
	 * 买入确认时间(结束)
	 */
	private Date orderBuyConfirmTimeEnd;
	/**
	 * 成交时间
	 */
	private Date orderDealTime;
	/**
	 * 成交时间(开始)
	 */
	private Date orderDealTimeStart;
	/**
	 * 成交时间(结束)
	 */
	private Date orderDealTimeEnd;
	
    public BuyOrderQuery() {}

    public BuyOrderQuery(Long userId, String userPhone, String userNickname, String userHeadicon, Long orderId, String orderOrderNo, Long orderTotal, Integer orderType, Long orderSellId, Long orderBuyId, Date orderCreateTime, Date orderCreateTimeStart, Date orderCreateTimeEnd, Date orderUpdateTime, Date orderUpdateTimeStart, Date orderUpdateTimeEnd, Integer orderStatus, Date orderSellConfirmTime, Date orderSellConfirmTimeStart, Date orderSellConfirmTimeEnd, Date orderBuyConfirmTime, Date orderBuyConfirmTimeStart, Date orderBuyConfirmTimeEnd, Date orderDealTime, Date orderDealTimeStart, Date orderDealTimeEnd) {
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
		this.orderCreateTimeStart = orderCreateTimeStart;
		this.orderCreateTimeEnd = orderCreateTimeEnd;
		this.orderUpdateTime = orderUpdateTime;
		this.orderUpdateTimeStart = orderUpdateTimeStart;
		this.orderUpdateTimeEnd = orderUpdateTimeEnd;
		this.orderStatus = orderStatus;
		this.orderSellConfirmTime = orderSellConfirmTime;
		this.orderSellConfirmTimeStart = orderSellConfirmTimeStart;
		this.orderSellConfirmTimeEnd = orderSellConfirmTimeEnd;
		this.orderBuyConfirmTime = orderBuyConfirmTime;
		this.orderBuyConfirmTimeStart = orderBuyConfirmTimeStart;
		this.orderBuyConfirmTimeEnd = orderBuyConfirmTimeEnd;
		this.orderDealTime = orderDealTime;
		this.orderDealTimeStart = orderDealTimeStart;
		this.orderDealTimeEnd = orderDealTimeEnd;
		
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

	public Date getOrderCreateTimeStart() {
		return orderCreateTimeStart;
	}

	public void setOrderCreateTimeStart(Date orderCreateTimeStart) {
		this.orderCreateTimeStart = orderCreateTimeStart;
	}

	public Date getOrderCreateTimeEnd() {
		return orderCreateTimeEnd;
	}

	public void setOrderCreateTimeEnd(Date orderCreateTimeEnd) {
		this.orderCreateTimeEnd = orderCreateTimeEnd;
	}

	public Date getOrderUpdateTime() {
		return orderUpdateTime;
	}

	public void setOrderUpdateTime(Date orderUpdateTime) {
		this.orderUpdateTime = orderUpdateTime;
	}

	public Date getOrderUpdateTimeStart() {
		return orderUpdateTimeStart;
	}

	public void setOrderUpdateTimeStart(Date orderUpdateTimeStart) {
		this.orderUpdateTimeStart = orderUpdateTimeStart;
	}

	public Date getOrderUpdateTimeEnd() {
		return orderUpdateTimeEnd;
	}

	public void setOrderUpdateTimeEnd(Date orderUpdateTimeEnd) {
		this.orderUpdateTimeEnd = orderUpdateTimeEnd;
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

	public Date getOrderSellConfirmTimeStart() {
		return orderSellConfirmTimeStart;
	}

	public void setOrderSellConfirmTimeStart(Date orderSellConfirmTimeStart) {
		this.orderSellConfirmTimeStart = orderSellConfirmTimeStart;
	}

	public Date getOrderSellConfirmTimeEnd() {
		return orderSellConfirmTimeEnd;
	}

	public void setOrderSellConfirmTimeEnd(Date orderSellConfirmTimeEnd) {
		this.orderSellConfirmTimeEnd = orderSellConfirmTimeEnd;
	}

	public Date getOrderBuyConfirmTime() {
		return orderBuyConfirmTime;
	}

	public void setOrderBuyConfirmTime(Date orderBuyConfirmTime) {
		this.orderBuyConfirmTime = orderBuyConfirmTime;
	}

	public Date getOrderBuyConfirmTimeStart() {
		return orderBuyConfirmTimeStart;
	}

	public void setOrderBuyConfirmTimeStart(Date orderBuyConfirmTimeStart) {
		this.orderBuyConfirmTimeStart = orderBuyConfirmTimeStart;
	}

	public Date getOrderBuyConfirmTimeEnd() {
		return orderBuyConfirmTimeEnd;
	}

	public void setOrderBuyConfirmTimeEnd(Date orderBuyConfirmTimeEnd) {
		this.orderBuyConfirmTimeEnd = orderBuyConfirmTimeEnd;
	}

	public Date getOrderDealTime() {
		return orderDealTime;
	}

	public void setOrderDealTime(Date orderDealTime) {
		this.orderDealTime = orderDealTime;
	}

	public Date getOrderDealTimeStart() {
		return orderDealTimeStart;
	}

	public void setOrderDealTimeStart(Date orderDealTimeStart) {
		this.orderDealTimeStart = orderDealTimeStart;
	}

	public Date getOrderDealTimeEnd() {
		return orderDealTimeEnd;
	}

	public void setOrderDealTimeEnd(Date orderDealTimeEnd) {
		this.orderDealTimeEnd = orderDealTimeEnd;
	}

	
    @Override
    public String toString() {
        return "BuyOrderDO{" +
                "}";
    }

}
