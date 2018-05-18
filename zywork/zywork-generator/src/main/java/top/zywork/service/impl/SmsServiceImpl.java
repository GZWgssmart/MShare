package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import top.zywork.query.SmsCodeQuery;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.SmsService;
import top.zywork.sms.SmsConstant;
import top.zywork.vo.SmsCodeVO;

import java.util.concurrent.TimeUnit;

@Service(value = "smsService")
public class SmsServiceImpl extends AbstractBaseService implements SmsService {

    private RedisTemplate<String, SmsCodeVO> redisTemplate;

    @Override
    public void saveSmsCode(SmsCodeVO smsCodeVO) {
        ValueOperations<String, SmsCodeVO> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("code:" + smsCodeVO.getIp(), smsCodeVO, SmsConstant.VALID_TIME, TimeUnit.MINUTES);
        valueOperations.set("code:" + smsCodeVO.getPhone(), smsCodeVO, SmsConstant.VALID_TIME, TimeUnit.MINUTES);
    }

    @Override
    public SmsCodeVO getSmsCode(SmsCodeQuery smsCodeQuery) {
        ValueOperations<String, SmsCodeVO> valueOperations = redisTemplate.opsForValue();
        SmsCodeVO smsCodeVO = valueOperations.get("code:" + smsCodeQuery.getIp());
        if (smsCodeVO == null) {
            smsCodeVO = valueOperations.get("code:" + smsCodeQuery.getPhone());
        }
        return smsCodeVO;
    }

    @Autowired
    public void setRedisTemplate(RedisTemplate<String, SmsCodeVO> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
