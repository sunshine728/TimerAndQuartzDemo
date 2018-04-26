package com.crescent_wu.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class DifferenceTest {
    public static void main(String[] args){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println( "Current time is : " +simpleDateFormat.format(calendar.getTime()));
        calendar.add(Calendar.SECOND,-6);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
                           @Override
                           public void run() {
                               //打印当前的计划执行时间
                               System.out.println("scheduled exec time is :"+simpleDateFormat.format(scheduledExecutionTime()));
                               System.out.println("Task is being exectued");

                           }
                       },
                calendar.getTime(), 2000);
    }
}
