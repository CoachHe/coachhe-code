package com.coachhe.spring.annotation.MyImport.功能3_指定实现ImportSelector;

import com.coachhe.spring.annotation.MyImport.Service.ServiceA;
import com.coachhe.spring.annotation.MyImport.Service.ServiceInterface;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(ServiceImportSelector.class)
@Configuration
public class ConfigA {
    @Bean
    @ConditionalOnMissingBean
    public ServiceInterface getServiceA(){
        return new ServiceA();
    }
}
