package com.company.first.commons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOC {
    public static ApplicationContext getCtx(){
        return new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
