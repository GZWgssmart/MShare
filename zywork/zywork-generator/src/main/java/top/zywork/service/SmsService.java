package top.zywork.service;

import top.zywork.query.SmsCodeQuery;
import top.zywork.vo.SmsCodeVO;

public interface SmsService extends BaseService {

    void saveSmsCode(SmsCodeVO smsCodeVO);

    SmsCodeVO getSmsCode(SmsCodeQuery smsCodeQuery);

}
