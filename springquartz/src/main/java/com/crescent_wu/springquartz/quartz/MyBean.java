package com.crescent_wu.springquartz.quartz;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component("myBean")
public class MyBean {
    public void printMessage(){

// 打印当前的执行时间，格式为2017-01-01 00:00:00
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("MyBean Executes!" + sf.format(date));    }
}
