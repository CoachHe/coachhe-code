package com.coachhe.序列化;

import java.io.*;

public class Serialize implements Serializable {
    private static final long serialVersionUID = Long.MIN_VALUE;
    public int num = 1390;

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/heyizhi/coachhe-code/Language/Java/Java开发/JavaWeb/深入分析JavaWeb技术内幕/Chapter2_JavaIO/src/main/resources/file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Serialize serialize = new Serialize();
            oos.writeObject(serialize);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
