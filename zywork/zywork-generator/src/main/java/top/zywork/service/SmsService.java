package top.zywork.service;

import top.zywork.query.SmsCodeQuery;
import top.zywork.vo.SmsCodeVO;

public interface SmsService extends BaseService {

    void saveSmsCode(String prefix, SmsCodeVO smsCodeVO);

    SmsCodeVO getSmsCode(String prefix, SmsCodeQuery smsCodeQuery);

}
