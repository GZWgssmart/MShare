package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.TotalScoreDAO;
import top.zywork.dos.TotalScoreDO;
import top.zywork.dto.TotalScoreDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.TotalScoreService;

import javax.annotation.PostConstruct;

/**
 * TotalScoreServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-19<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "totalScoreService")
public class TotalScoreServiceImpl extends AbstractBaseService implements TotalScoreService {

    private TotalScoreDAO totalScoreDAO;

    @Autowired
    public void setTotalScoreDAO(TotalScoreDAO totalScoreDAO) {
        super.setBaseDAO(totalScoreDAO);
        this.totalScoreDAO = totalScoreDAO;
    }

    @PostConstruct
    public void init() {
        super.init(TotalScoreDO.class, TotalScoreDTO.class);
    }
}
