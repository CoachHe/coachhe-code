package com.coachhe.字节与字符的转化接口;

import java.io.FileReader;
import java.io.IOException;

public class test01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("/Users/heyizhi/coachhe-code/Language/Java/Java开发/JavaWeb/深入分析JavaWeb技术内幕/Chapter2_JavaIO/src/main/resources/file.txt");
            StringBuffer str = new StringBuffer();
            char[] buf = new char[1024];
            while (f.read(buf) > 0) {
                str.append(buf);
            }
            str.toString();
            System.out.println(str.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
