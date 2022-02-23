package com.coachhe.spring.annotation.MyImport.功能1_引入其他Configuraion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigC {
    @Bean
    public String test(){
        return "TestC";
    }
}
