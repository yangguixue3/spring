package com.msr.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试 service 层用
 */
public class AccountServiceTest {
    @Test
    public void testQueryAll(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("SpringApplicationContext.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.queryAll();
    }

}
