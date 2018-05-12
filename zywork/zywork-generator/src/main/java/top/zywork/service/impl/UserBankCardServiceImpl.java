package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.UserBankCardDAO;
import top.zywork.dos.UserBankCardDO;
import top.zywork.dto.UserBankCardDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.UserBankCardService;

import javax.annotation.PostConstruct;

/**
 * UserBankCardServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-10<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "userBankCardService")
public class UserBankCardServiceImpl extends AbstractBaseService implements UserBankCardService {

    private UserBankCardDAO userBankCardDAO;

    @Autowired
    public void setUserBankCardDAO(UserBankCardDAO userBankCardDAO) {
        super.setBaseDAO(userBankCardDAO);
        this.userBankCardDAO = userBankCardDAO;
    }

    @PostConstruct
    public void init() {
        super.init(UserBankCardDO.class, UserBankCardDTO.class);
    }
}
