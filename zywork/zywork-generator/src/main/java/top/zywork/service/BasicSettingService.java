package top.zywork.service;

import java.io.Serializable;

/**
 * BasicSettingService服务接口<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public interface BasicSettingService extends BaseService {
    public Object getByIdCache(Serializable id);
}
