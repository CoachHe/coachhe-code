package com.coachhe.boot.config;

import com.coachhe.boot.bean.Pet;
import com.coachhe.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1.配置类中使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2.配置类本身也是组件
 * 3.ProxyBeanMethod
 */
@Configuration(proxyBeanMethods = true)
public class MyConfig{

    /**
     * 外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象
     * @return
     */
    @Bean
    public User coachhe01(){
        return new User("coachhe1", 18);
    }

    @Bean
    public Pet tomcat01(){
        return new Pet("tomcat");
    }

}
