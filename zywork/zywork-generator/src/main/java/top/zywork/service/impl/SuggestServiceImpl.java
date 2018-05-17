package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.SuggestDAO;
import top.zywork.dos.SuggestDO;
import top.zywork.dto.SuggestDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.SuggestService;

import javax.annotation.PostConstruct;

/**
 * SuggestServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-17<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "suggestService")
public class SuggestServiceImpl extends AbstractBaseService implements SuggestService {

    private SuggestDAO suggestDAO;

    @Autowired
    public void setSuggestDAO(SuggestDAO suggestDAO) {
        super.setBaseDAO(suggestDAO);
        this.suggestDAO = suggestDAO;
    }

    @PostConstruct
    public void init() {
        super.init(SuggestDO.class, SuggestDTO.class);
    }
}
