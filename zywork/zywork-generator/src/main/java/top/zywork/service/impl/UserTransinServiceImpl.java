package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.UserTransinDAO;
import top.zywork.dos.UserTransinDO;
import top.zywork.dto.UserTransinDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.UserTransinService;

import javax.annotation.PostConstruct;

/**
 * UserTransinServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-09<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "userTransinService")
public class UserTransinServiceImpl extends AbstractBaseService implements UserTransinService {

    private UserTransinDAO userTransinDAO;

    @Autowired
    public void setUserTransinDAO(UserTransinDAO userTransinDAO) {
        super.setBaseDAO(userTransinDAO);
        this.userTransinDAO = userTransinDAO;
    }

    @PostConstruct
    public void init() {
        super.init(UserTransinDO.class, UserTransinDTO.class);
    }
}
