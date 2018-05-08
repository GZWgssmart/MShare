package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.BasicSettingDAO;
import top.zywork.dos.BasicSettingDO;
import top.zywork.dto.BasicSettingDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.BasicSettingService;

import javax.annotation.PostConstruct;

/**
 * BasicSettingServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "basicSettingService")
public class BasicSettingServiceImpl extends AbstractBaseService implements BasicSettingService {

    private BasicSettingDAO basicSettingDAO;

    @Autowired
    public void setBasicSettingDAO(BasicSettingDAO basicSettingDAO) {
        super.setBaseDAO(basicSettingDAO);
        this.basicSettingDAO = basicSettingDAO;
    }

    @PostConstruct
    public void init() {
        super.init(BasicSettingDO.class, BasicSettingDTO.class);
    }
}
