package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.LevelSettingDAO;
import top.zywork.dos.LevelSettingDO;
import top.zywork.dto.LevelSettingDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.LevelSettingService;

import javax.annotation.PostConstruct;

/**
 * LevelSettingServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "levelSettingService")
public class LevelSettingServiceImpl extends AbstractBaseService implements LevelSettingService {

    private LevelSettingDAO levelSettingDAO;

    @Autowired
    public void setLevelSettingDAO(LevelSettingDAO levelSettingDAO) {
        super.setBaseDAO(levelSettingDAO);
        this.levelSettingDAO = levelSettingDAO;
    }

    @PostConstruct
    public void init() {
        super.init(LevelSettingDO.class, LevelSettingDTO.class);
    }
}
