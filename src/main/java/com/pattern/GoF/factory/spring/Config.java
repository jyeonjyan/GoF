package com.pattern.GoF.factory.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public String hello(){
        return "hello";
    }
}
