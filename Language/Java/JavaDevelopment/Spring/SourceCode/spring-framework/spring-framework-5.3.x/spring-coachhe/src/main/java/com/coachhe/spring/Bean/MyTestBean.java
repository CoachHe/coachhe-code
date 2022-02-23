package com.coachhe.spring.Bean;



public class MyTestBean {
	String testStr;
	public String getTestStr() {
		return testStr;
	}
	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	//为了debug方便，确认什么时候创建了这个bean
	public MyTestBean() {
		System.out.println("Bean myTestBean is creating");
	}
}
