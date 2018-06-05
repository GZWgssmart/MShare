package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.common.ExceptionUtils;
import top.zywork.constant.OrderStatusConstant;
import top.zywork.constant.OrderStatusConstantV1;
import top.zywork.dao.OrderDAO;
import top.zywork.dao.UserDAO;
import top.zywork.dos.OrderDO;
import top.zywork.dos.UserDO;
import top.zywork.dto.OrderDTO;
import top.zywork.query.UserOrderQuery;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.OrderService;

import javax.annotation.PostConstruct;

/**
 * OrderServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "orderService")
public class OrderServiceImpl extends AbstractBaseService implements OrderService {

    private OrderDAO orderDAO;

    private UserDAO userDAO;

    @Override
    public void update(Object dataTransferObj) {
        try {
            OrderDO orderDO = getBeanMapper().map(dataTransferObj, OrderDO.class);
            orderDAO.update(orderDO);
            UserOrderQuery userOrderQuery = new UserOrderQuery();
            if (orderDO.getStatus() == OrderStatusConstantV1.ORDER_ALREADY_SELL) {
                userOrderQuery.setId(orderDO.getId());
                userOrderQuery.setTotal(orderDO.getTotal());
                userDAO.updateOrderBuy(userOrderQuery);
                userDAO.updateOrderSell(userOrderQuery);
            }
        } catch (RuntimeException e) {
            throw ExceptionUtils.serviceException(e);
        }
    }

    @Autowired
    public void setOrderDAO(OrderDAO orderDAO) {
        super.setBaseDAO(orderDAO);
        this.orderDAO = orderDAO;
    }

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @PostConstruct
    public void init() {
        super.init(OrderDO.class, OrderDTO.class);
    }
}
