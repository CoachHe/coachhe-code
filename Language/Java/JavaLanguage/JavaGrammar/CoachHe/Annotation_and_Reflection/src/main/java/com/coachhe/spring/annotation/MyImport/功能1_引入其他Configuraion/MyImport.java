package com.coachhe.spring.annotation.MyImport.功能1_引入其他Configuraion;

import com.coachhe.spring.annotation.MyImport.Service.ServiceInterface;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyImport {
    public static void main(String[] args) {
    }



    @Test
    public void testC(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigC.class);
        String bean = ctx.getBean(String.class);
        System.out.println(bean);
    }


    @Test
    public void testA(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigA.class);
        ServiceInterface bean = ctx.getBean(ServiceInterface.class);
        bean.test();
    }

}
