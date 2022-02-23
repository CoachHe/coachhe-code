package com.coachhe.spring;

import com.coachhe.spring.Bean.MyTestBean;
import com.coachhe.spring.Bean.MyTestBean2;
//import com.coachhe.spring.Service.MyAwareService;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import com.coachhe.spring.cycle.A;
import com.coachhe.spring.cycle.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class Main {

//	@Autowired
//	MyAwareService myAwareService;

	// Aware测试
	@Test
	public void MyAwareTest(){
//		ApplicationContext context = new AnnotationConfigApplicationContext("ComponentScanClass.java");
//		MyAwareServiceImpl myAwareService = context.getBean("myAwareServiceImpl", MyAwareServiceImpl.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		myAwareService.showBeanName();
	}

	// 循环依赖测试
	@Test
	public void CycleTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cycle.xml");
		A beanA = context.getBean(A.class);
		System.out.println(beanA.getB());
		B beanB = context.getBean(B.class);
		System.out.println(beanB.getA());
	}


	public static void main(String[] args) {
		// 1. ioc容器的创建
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		BeanFactory context = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//		Resource resource = new ClassPathResource("applicationContext.xml");
//		BeanFactory context = new DefaultListableBeanFactory();
//		BeanDefinitionReader bdr = new XmlBeanDefinitionReader((BeanDefinitionRegistry) context);
//		bdr.loadBeanDefinitions(resource);
		MyTestBean myTestBean1 = context.getBean("testStr1", MyTestBean.class);
		MyTestBean2 myTestBean2 = context.getBean("testStr2", MyTestBean2.class);
		System.out.println(myTestBean1.getTestStr());
		System.out.println(myTestBean2.getTestStr2());





	}
}
