package top.zywork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zywork.dao.BankCardDAO;
import top.zywork.dos.BankCardDO;
import top.zywork.dto.BankCardDTO;
import top.zywork.service.AbstractBaseService;
import top.zywork.service.BankCardService;

import javax.annotation.PostConstruct;

/**
 * BankCardServiceImpl服务接口实现类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Service(value = "bankCardService")
public class BankCardServiceImpl extends AbstractBaseService implements BankCardService {

    private BankCardDAO bankCardDAO;

    @Autowired
    public void setBankCardDAO(BankCardDAO bankCardDAO) {
        super.setBaseDAO(bankCardDAO);
        this.bankCardDAO = bankCardDAO;
    }

    @PostConstruct
    public void init() {
        super.init(BankCardDO.class, BankCardDTO.class);
    }
}
