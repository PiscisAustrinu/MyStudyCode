package com.Ylb.Spring5.Test;

import com.Ylb.Spring5.Config.TxConfig;
import com.Ylb.Spring5.Service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = TxConfig.class)
//将上面两个注解用一个注解代替
@SpringJUnitConfig(classes = TxConfig.class)
public class JUnit5 {
    @Autowired
    private AccountService accountService;
    @Test
    public void testJUnit5(){
        accountService.accountMoney();
    }
}
