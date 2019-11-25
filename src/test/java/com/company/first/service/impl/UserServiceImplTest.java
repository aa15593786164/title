package com.company.first.service.impl;

import com.company.first.commons.ResResult;
import com.company.first.dao.pojo.User;
import com.company.first.service.iservice.IUserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceImplTest {
    @Autowired
    private IUserService userService;

    @Test
    public void login() throws Exception {
        ResResult<User> rr = userService.login("scott","tiger");
        TestCase.assertNotNull(rr.getData());
        System.out.println(rr);
        ResResult<User> rr1 = userService.login("scott11","tiger11");
        System.out.println(rr1);
    }
}