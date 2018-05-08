package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.OrderDAO;
import top.zywork.dos.OrderDO;
import top.zywork.dto.OrderDTO;
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

    @Autowired
    public void setOrderDAO(OrderDAO orderDAO) {
        super.setBaseDAO(orderDAO);
        this.orderDAO = orderDAO;
    }

    @PostConstruct
    public void init() {
        super.init(OrderDO.class, OrderDTO.class);
    }
}
