package top.zywork.service.impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.common.DozerMapperUtils;
import top.zywork.common.ExceptionUtils;
import top.zywork.dao.SellOrderDAO;
import top.zywork.dos.SellOrderDO;
import top.zywork.dto.PagerDTO;
import top.zywork.dto.SellOrderDTO;
import top.zywork.query.PageQuery;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.SellOrderService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * UserSellOrderServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-12<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "userSellOrderService")
public class SellOrderServiceImpl extends AbstractBaseService implements SellOrderService {

    private SellOrderDAO userSellOrderDAO;

    @Override
    public PagerDTO listPageByConditionNotSelf(PageQuery pageQuery, Object queryObj) {
        PagerDTO pagerDTO = new PagerDTO(pageQuery.getPageNo(), pageQuery.getPageSize());
        try {
            Long count = userSellOrderDAO.countByConditionNotSelf(queryObj);
            pagerDTO.setTotal(count);
            if (count > 0) {
                List<Object> doObjList = userSellOrderDAO.listPageByConditionNotSelf(pageQuery, queryObj);
                pagerDTO.setRows(DozerMapperUtils.mapList(getBeanMapper(), doObjList, SellOrderDTO.class));
            } else {
                pagerDTO.setRows(new ArrayList<>());
            }
            return pagerDTO;
        } catch (RuntimeException e) {
            throw ExceptionUtils.serviceException(e);
        }
    }

    @Autowired
    public void setUserSellOrderDAO(SellOrderDAO userSellOrderDAO) {
        super.setBaseDAO(userSellOrderDAO);
        this.userSellOrderDAO = userSellOrderDAO;
    }

    @PostConstruct
    public void init() {
        super.init(SellOrderDO.class, SellOrderDTO.class);
    }
}
