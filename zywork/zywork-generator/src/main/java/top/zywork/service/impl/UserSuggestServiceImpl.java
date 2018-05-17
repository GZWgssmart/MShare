package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.UserSuggestDAO;
import top.zywork.dos.UserSuggestDO;
import top.zywork.dto.UserSuggestDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.UserSuggestService;

import javax.annotation.PostConstruct;

/**
 * UserSuggestServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-17<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "userSuggestService")
public class UserSuggestServiceImpl extends AbstractBaseService implements UserSuggestService {

    private UserSuggestDAO userSuggestDAO;

    @Autowired
    public void setUserSuggestDAO(UserSuggestDAO userSuggestDAO) {
        super.setBaseDAO(userSuggestDAO);
        this.userSuggestDAO = userSuggestDAO;
    }

    @PostConstruct
    public void init() {
        super.init(UserSuggestDO.class, UserSuggestDTO.class);
    }
}
