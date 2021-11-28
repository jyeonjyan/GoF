package com.pattern.GoF.factory.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfig {
    public static void main(String[] args) {
        BeanFactory javaFactory = new AnnotationConfigApplicationContext(Config.class);
        String hello = javaFactory.getBean("hello", String.class);
        System.out.println(hello);
    }
}
