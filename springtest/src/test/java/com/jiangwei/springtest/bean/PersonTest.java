package com.jiangwei.springtest.bean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by weijiang
 * Date: 2016/12/21
 * Desc:
 */
public class PersonTest {

    private ApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("classpath:spring_cfg.xml");
    }

    @Test
    public void testPerson() {
        Person ps = (Person) context.getBean("person", Person.class);
        System.out.println(ps.getSon().getAge());
    }

    @Test
    public void testSon() {
        Son s2 = (Son) context.getBean("son2", Son.class);
        System.out.println(s2.getAge());
    }

}
