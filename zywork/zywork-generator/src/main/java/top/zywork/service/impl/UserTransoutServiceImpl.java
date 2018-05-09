package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.UserTransoutDAO;
import top.zywork.dos.UserTransoutDO;
import top.zywork.dto.UserTransoutDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.UserTransoutService;

import javax.annotation.PostConstruct;

/**
 * UserTransoutServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-09<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "userTransoutService")
public class UserTransoutServiceImpl extends AbstractBaseService implements UserTransoutService {

    private UserTransoutDAO userTransoutDAO;

    @Autowired
    public void setUserTransoutDAO(UserTransoutDAO userTransoutDAO) {
        super.setBaseDAO(userTransoutDAO);
        this.userTransoutDAO = userTransoutDAO;
    }

    @PostConstruct
    public void init() {
        super.init(UserTransoutDO.class, UserTransoutDTO.class);
    }
}
