package com.coachhe.spring.Bean;

public class MyTestBean2 {
	String testStr2 = "";

	public String getTestStr2() {
		return testStr2;
	}

	public void setTestStr2(String testStr2) {
		this.testStr2 = testStr2;
	}

	public MyTestBean2(){
		System.out.println("Bean myTestBean2 is creating");
	}
}
