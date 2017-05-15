package com.jiangwei.springtest.beanfactory;

import com.alibaba.fastjson.JSON;
import com.jiangwei.springtest.bean.Cat;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Franco on 2017/5/11.
 */
public class CatBeanFactory {

    public static void main(String[] args) {

        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        //加载spring的配置元数据文件 xml
        ClassPathResource resource = new ClassPathResource("spring_cfg.xml");
        //xml Bean定义读取器读取元数据文件
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);

        Cat cat = (Cat) defaultListableBeanFactory.getBean("cat");

        System.out.println(JSON.toJSONString(cat));
    }
}
