package com.coachhe.Chapter1_Intro;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class phoneClass = Class.forName("xxx");
        Phone phone = (Phone) phoneClass.newInstance();
        phone.call();
    }
}

