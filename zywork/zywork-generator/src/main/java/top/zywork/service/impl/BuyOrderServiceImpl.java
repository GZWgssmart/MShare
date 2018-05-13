package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.BuyOrderDAO;
import top.zywork.dos.BuyOrderDO;
import top.zywork.dto.BuyOrderDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.BuyOrderService;

import javax.annotation.PostConstruct;

/**
 * UserBuyOrderServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-12<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "userBuyOrderService")
public class BuyOrderServiceImpl extends AbstractBaseService implements BuyOrderService {

    private BuyOrderDAO userBuyOrderDAO;

    @Autowired
    public void setUserBuyOrderDAO(BuyOrderDAO userBuyOrderDAO) {
        super.setBaseDAO(userBuyOrderDAO);
        this.userBuyOrderDAO = userBuyOrderDAO;
    }

    @PostConstruct
    public void init() {
        super.init(BuyOrderDO.class, BuyOrderDTO.class);
    }
}
