package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.TransDAO;
import top.zywork.dos.TransDO;
import top.zywork.dto.TransDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.TransService;

import javax.annotation.PostConstruct;

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

    @Autowired
    public void setTransDAO(TransDAO transDAO) {
        super.setBaseDAO(transDAO);
        this.transDAO = transDAO;
    }

    @PostConstruct
    public void init() {
        super.init(TransDO.class, TransDTO.class);
    }
}
