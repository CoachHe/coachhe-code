package com.coachhe.spring.Service.AwareService;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements BeanFactoryAware, ApplicationContextAware {

	private String name;
	private int age;

	private BeanFactory beanFactory;
	private ApplicationContext applicationContext;

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	// 谁在什么时候调用此方法？
	// 1. 容器帮我们去调用这个方法
	// 2. 定义统一的规范接口来实现此功能
	public void setBeanFactory(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
