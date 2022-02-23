package com.coachhe.spring.annotation.MyImport.功能3_指定实现ImportSelector;

import com.coachhe.spring.annotation.MyImport.Service.ServiceInterface;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyImportTest {

    @Test
    public void testA(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigA.class);
        ServiceInterface bean = ctx.getBean(ServiceInterface.class);
        bean.test();
    }

}
