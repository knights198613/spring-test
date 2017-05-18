package com.jiangwei.springtest.beanwrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

/**
 * Created by weijiang
 * Date: 2017/5/18
 * Desc:
 */
public class BeanWrapperTest {

    public static void main(String[] args) {
        BeanWrapper companyWrapper = new BeanWrapperImpl(new Company());
        companyWrapper.setPropertyValue("companyName", "jingdong.cn");

        String companyName = (String) companyWrapper.getPropertyValue("companyName");
        System.out.println(companyName);

        BeanWrapper tom = new BeanWrapperImpl(new Employee());
        tom.setPropertyValue(new PropertyValue("name", "tom"));
        tom.setPropertyValue("salary", 3400.56);

        companyWrapper.setPropertyValue("employee", tom.getWrappedInstance());

        System.out.println(companyWrapper.getPropertyValue("employee.salary"));

    }
}
