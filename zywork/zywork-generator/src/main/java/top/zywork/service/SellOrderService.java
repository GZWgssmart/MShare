package top.zywork.service;

import top.zywork.dto.PagerDTO;
import top.zywork.query.PageQuery;

import java.util.List;

/**
 * UserSellOrderService服务接口<br/>
 *
 * 创建于2018-05-12<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public interface SellOrderService extends BaseService {

    PagerDTO listPageByConditionNotSelf(PageQuery pageQuery, Object queryObj);
}
