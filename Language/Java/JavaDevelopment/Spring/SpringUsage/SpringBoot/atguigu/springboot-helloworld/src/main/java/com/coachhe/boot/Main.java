package com.coachhe.boot;

import com.coachhe.boot.bean.User;
import com.coachhe.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @SpringBootApplication: 这是一个SpringBoot应用
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);

        // 1.返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);

        // 2. 查看容器里的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }

        // 3. 从容器中获取组件
        User coachhe01 = run.getBean("coachhe01", User.class);
        User coachhe02 = run.getBean("coachhe01", User.class);
        System.out.println(coachhe01 == coachhe02);

        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        // 如果ProxyBeanMethod为true，那么MyConfig就是一个增强的代理对象，返回的Bean都是单例的
        // 但是如果ProxyBeanMethod为false，那么MyConfig就是一个正常的对象，返回的Bean不是单例的
        User user = bean.coachhe01();
        User user1 = bean.coachhe01();
        System.out.println(user == user1);

    }
}
