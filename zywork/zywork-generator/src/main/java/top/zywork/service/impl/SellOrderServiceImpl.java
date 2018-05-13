package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.SellOrderDAO;
import top.zywork.dos.SellOrderDO;
import top.zywork.dto.SellOrderDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.SellOrderService;

import javax.annotation.PostConstruct;

/**
 * UserSellOrderServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-12<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "userSellOrderService")
public class SellOrderServiceImpl extends AbstractBaseService implements SellOrderService {

    private SellOrderDAO userSellOrderDAO;

    @Autowired
    public void setUserSellOrderDAO(SellOrderDAO userSellOrderDAO) {
        super.setBaseDAO(userSellOrderDAO);
        this.userSellOrderDAO = userSellOrderDAO;
    }

    @PostConstruct
    public void init() {
        super.init(SellOrderDO.class, SellOrderDTO.class);
    }
}
