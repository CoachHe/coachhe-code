package com.coachhe.WritableComparable.分区排序;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;


public class ProvincePartitioner extends Partitioner<FlowBean, Text> {
    public int getPartition(FlowBean flowBean, Text text, int i) {

        //按照手机号前三位分区
        String prePhoneNum = text.toString().substring(0, 3);


        int partition = 4;
        if ("136".equals(prePhoneNum)) {
            partition = 0;
        } else if ("137".equals(prePhoneNum)) {
            partition = 1;
        } else if ("138".equals(prePhoneNum)) {
            partition = 2;
        } else if ("139".equals(prePhoneNum)) {
            partition = 3;
        }

        return partition;
    }
}
