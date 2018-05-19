package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.UserTotalScoreDAO;
import top.zywork.dos.UserTotalScoreDO;
import top.zywork.dto.UserTotalScoreDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.UserTotalScoreService;

import javax.annotation.PostConstruct;

/**
 * UserTotalScoreServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-19<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "userTotalScoreService")
public class UserTotalScoreServiceImpl extends AbstractBaseService implements UserTotalScoreService {

    private UserTotalScoreDAO userTotalScoreDAO;

    @Autowired
    public void setUserTotalScoreDAO(UserTotalScoreDAO userTotalScoreDAO) {
        super.setBaseDAO(userTotalScoreDAO);
        this.userTotalScoreDAO = userTotalScoreDAO;
    }

    @PostConstruct
    public void init() {
        super.init(UserTotalScoreDO.class, UserTotalScoreDTO.class);
    }
}
