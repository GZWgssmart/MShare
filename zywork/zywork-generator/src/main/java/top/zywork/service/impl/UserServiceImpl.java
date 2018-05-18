package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import top.zywork.common.ExceptionUtils;
import top.zywork.dao.BasicSettingDAO;
import top.zywork.dao.UserDAO;
import top.zywork.dos.UserDO;
import top.zywork.dto.BasicSettingDTO;
import top.zywork.dto.UserDTO;
import top.zywork.dto.UserTokenDTO;
import top.zywork.query.UserAccountPasswordQuery;
import top.zywork.query.UserPayPasswordQuery;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.BasicSettingService;
import top.zywork.service.UserService;
import top.zywork.vo.UserVO;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * UserServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-02<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "userService")
public class UserServiceImpl extends AbstractBaseService implements UserService {

    private UserDAO userDAO;
    private RedisTemplate<String, UserTokenDTO> redisTemplate;

    private BasicSettingService basicSettingService;

    @Override
    public void save(Object dataTransferObj) {
        try {
            BasicSettingDTO basicSettingDTO = (BasicSettingDTO) basicSettingService.getByIdCache(1L);
            UserDO userDO = getBeanMapper().map(dataTransferObj, UserDO.class);
            userDO.setProps(basicSettingDTO.getRegBonus());
            userDAO.save(userDO);
            UserDO userDO1 = new UserDO();
            userDO1.setId(userDO.getFromId());
            userDO1.setProps(basicSettingDTO.getRegBonus());
            userDAO.updateProps(userDO1);
        } catch (RuntimeException e) {
            throw ExceptionUtils.serviceException(e);
        }
    }

    @Override
    public Object getByAccountPassword(UserAccountPasswordQuery userAccountPasswordQuery) {
        Object obj = userDAO.getByAccountPassword(userAccountPasswordQuery);
        if (obj != null) {
            return getBeanMapper().map(obj, getDtoClass());
        }
        return null;
    }

    @Override
    public String getPassword(String username) {
        return userDAO.getPassword(username);
    }

    @Override
    public void saveUserToken(UserTokenDTO userTokenDTO) {
        ValueOperations<String, UserTokenDTO> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("user:" + userTokenDTO.getUsername(), userTokenDTO);
        redisTemplate.expire(userTokenDTO.getUsername(), 7, TimeUnit.DAYS);
    }

    @Override
    public UserTokenDTO getUserToken(String username) {
        ValueOperations<String, UserTokenDTO> valueOperations = redisTemplate.opsForValue();
        return valueOperations.get("user:" + username);
    }

    @Override
    public void removeUserToken(String username) {
        redisTemplate.delete("user:" + username);
    }

    @Override
    public Object getByPayPassword(UserPayPasswordQuery userPayPasswordQuery) {
        Object obj = userDAO.getByPayPassword(userPayPasswordQuery);
        if (obj != null) {
            return getBeanMapper().map(obj, getDtoClass());
        }
        return null;
    }

    @Override
    public Object getByPhone(String phone) {
        Object obj = userDAO.getByPhone(phone);
        if (obj != null) {
            return getBeanMapper().map(obj, getDtoClass());
        }
        return null;
    }

    @Override
    public void updateProps(Object dataTransferObj) {
        userDAO.updateProps(getBeanMapper().map(dataTransferObj, UserDO.class));
    }

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        super.setBaseDAO(userDAO);
        this.userDAO = userDAO;
    }

    @Autowired
    public void setRedisTemplate(RedisTemplate<String, UserTokenDTO> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Autowired
    public void setBasicSettingService(BasicSettingService basicSettingService) {
        this.basicSettingService = basicSettingService;
    }

    @PostConstruct
    public void init() {
        super.init(UserDO.class, UserDTO.class);
    }
}
