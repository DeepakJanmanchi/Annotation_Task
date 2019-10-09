package com.stackroute;

import com.stackroute.domain.BeanLifeCycleDemo;
import com.stackroute.domain.BeanLifeCycleDemo;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(DataConfig.class);
        BeanLifeCycleDemo bee = (BeanLifeCycleDemo) applicationContext.getBean("BeanLifeCycleDemo");

        System.out.println(bee);




    }
}