package com.company.first.dao.impl;

import com.company.first.commons.ResResult;
import com.company.first.dao.idao.IUserDao;
import com.company.first.dao.pojo.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoImplTest {
    @Autowired
   private IUserDao userDao;
    @Test
    public void login() throws Exception {
        ResResult<User> rr = userDao.login("scott","tiger");
        TestCase.assertNotNull(rr.getData());
        System.out.println(rr);
        ResResult<User> rr1 = userDao.login("scott11","tiger11");
        System.out.println(rr1);
    }
}