package top.zywork.service.impl;

import org.activiti.engine.identity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.common.ExceptionUtils;
import top.zywork.dao.BasicSettingDAO;
import top.zywork.dao.TransDAO;
import top.zywork.dao.UserDAO;
import top.zywork.dos.TransDO;
import top.zywork.dos.UserDO;
import top.zywork.dto.BasicSettingDTO;
import top.zywork.dto.TransDTO;
import top.zywork.query.UserTransQuery;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.BasicSettingService;
import top.zywork.service.TransService;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * TransServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "transService")
public class TransServiceImpl extends AbstractBaseService implements TransService {

    private TransDAO transDAO;
    private UserDAO userDAO;
    private BasicSettingService basicSettingService;

    @Override
    public void save(Object dataTransferObj) {
        try {
            transDAO.save(getBeanMapper().map(dataTransferObj, TransDO.class));
            BasicSettingDTO basicSettingDTO = (BasicSettingDTO) basicSettingService.getByIdCache(1L);
            TransDTO transDTO = (TransDTO) dataTransferObj;
            UserTransQuery userTransQueryFrom = new UserTransQuery(transDTO.getTransFrom(),
                    -transDTO.getTotal(),
                    (long) ((100 - basicSettingDTO.getScorePercent()) / 100 * transDTO.getTotal()));
            userDAO.updateTrans(userTransQueryFrom);
            UserTransQuery userTransQueryTo = new UserTransQuery(transDTO.getTransTo(),
                    (long) (transDTO.getTotal() * basicSettingDTO.getMoneyPercent() / 100),
                    (long) (basicSettingDTO.getScorePercent() / 100 * transDTO.getTotal()));
            userDAO.updateTrans(userTransQueryTo);
        } catch (RuntimeException e) {
            throw ExceptionUtils.serviceException(e);
        }
    }

    @Autowired
    public void setTransDAO(TransDAO transDAO) {
        super.setBaseDAO(transDAO);
        this.transDAO = transDAO;
    }

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Resource
    public void setBasicSettingService(BasicSettingService basicSettingService) {
        this.basicSettingService = basicSettingService;
    }

    @PostConstruct
    public void init() {
        super.init(TransDO.class, TransDTO.class);
    }
}
