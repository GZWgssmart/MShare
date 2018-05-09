package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import top.zywork.dao.BasicSettingDAO;
import top.zywork.dos.BasicSettingDO;
import top.zywork.dto.BasicSettingDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.BasicSettingService;

import javax.annotation.PostConstruct;
import java.io.Serializable;

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
    private RedisTemplate<String, BasicSettingDTO> redisTemplate;

    @Override
    public Object getByIdCache(Serializable id) {
        ValueOperations<String, BasicSettingDTO> valueOperations = redisTemplate.opsForValue();
        BasicSettingDTO basicSettingDTO = valueOperations.get("basic_setting");
        if (basicSettingDTO == null) {
            Object obj = getById(id);
            if (obj != null) {
                basicSettingDTO = (BasicSettingDTO) obj;
                valueOperations.set("basic_setting", basicSettingDTO);
            }

        }
        return basicSettingDTO;
    }

    @Autowired
    public void setBasicSettingDAO(BasicSettingDAO basicSettingDAO) {
        super.setBaseDAO(basicSettingDAO);
        this.basicSettingDAO = basicSettingDAO;
    }

    @Autowired
    public void setRedisTemplate(RedisTemplate<String, BasicSettingDTO> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    public void init() {
        super.init(BasicSettingDO.class, BasicSettingDTO.class);
    }
}
