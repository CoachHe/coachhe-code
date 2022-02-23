package com.coachhe.spring.annotation.MyImport.功能1_引入其他Configuraion;

import com.coachhe.spring.annotation.MyImport.Service.ServiceB;
import com.coachhe.spring.annotation.MyImport.Service.ServiceInterface;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

public class ConfigB {
    @Bean
    @ConditionalOnMissingBean
    public ServiceInterface getServiceB(){
        return new ServiceB();
    }
}
