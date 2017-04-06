package com.jiangwei.springtest.bean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by weijiang
 * Date: 2017/1/18
 * Desc:
 */
public class TestClassPropertiesWared {

     ApplicationContext context = null;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("spring_cfg.xml");
    }

    @Test
    public void testPropertesWared() {
        Animals animals = (Animals) context.getBean("animals");

        animals.outCatName();

        System.out.println(animals.getCat().getName());
    }

}
