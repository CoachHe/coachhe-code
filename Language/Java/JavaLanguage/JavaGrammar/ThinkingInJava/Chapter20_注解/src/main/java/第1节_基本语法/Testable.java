package 第1节_基本语法;

import 第1节_基本语法.A_定义注解.Test;

public class Testable {
    public void execute(){
        System.out.println("Executing..");
    }
    @Test
    void testExecute(){
        execute();
    }
}
