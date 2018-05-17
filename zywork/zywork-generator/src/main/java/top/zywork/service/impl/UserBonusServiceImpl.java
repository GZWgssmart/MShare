package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.UserBonusDAO;
import top.zywork.dos.UserBonusDO;
import top.zywork.dto.UserBonusDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.UserBonusService;

import javax.annotation.PostConstruct;

/**
 * UserBonusServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-17<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "userBonusService")
public class UserBonusServiceImpl extends AbstractBaseService implements UserBonusService {

    private UserBonusDAO userBonusDAO;

    @Autowired
    public void setUserBonusDAO(UserBonusDAO userBonusDAO) {
        super.setBaseDAO(userBonusDAO);
        this.userBonusDAO = userBonusDAO;
    }

    @PostConstruct
    public void init() {
        super.init(UserBonusDO.class, UserBonusDTO.class);
    }
}
