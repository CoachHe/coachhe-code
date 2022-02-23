package com.coachhe.spring.annotation.MyImport.功能3_指定实现ImportSelector;

import com.coachhe.spring.annotation.MyImport.Service.ServiceB;
import com.coachhe.spring.annotation.MyImport.Service.ServiceInterface;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigB {
    @Bean
    @ConditionalOnMissingBean
    public ServiceInterface getServiceB(){
        return new ServiceB();
    }

}
