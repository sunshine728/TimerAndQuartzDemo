package com.crescent_wu.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

public class MyTimer {
    public static void main(String[] args){
        //创建一个MyTimerTask实例
        MyTimerTask myTimerTask = new MyTimerTask("1");
        //创建一个Timer实例
        Timer timer = new Timer();
        //通过timer定时定频率调用MyTimerTask的业务逻辑
//        timer.schedule(myTimerTask,2000L,1000L);
        /**
         * 获取当前时间 并设置成距离当前时间3秒之后的时间
         */
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println( simpleDateFormat.format(calendar.getTime()));

        calendar.add(Calendar.SECOND,3);
        /**
         * 在时间等于或超过time的时候执行且仅执行一次task
         */

//        myTimerTask.setName("schedule1");
//        timer.schedule(myTimerTask,calendar.getTime());

        /**
         * 时间等于或超过time时首次执行task
         * 之后每隔period毫秒重复执行一次task
         */
//        myTimerTask.setName("schedule2");
//        timer.schedule(myTimerTask,calendar.getTime(),2000);
        /**
         * 等待delay毫秒后执行且仅执行一次task
         *
         */
        myTimerTask.setName("schedule3");
        timer.schedule(myTimerTask,1000);
        System.out.println("schedule time is "+simpleDateFormat.format(myTimerTask.scheduledExecutionTime()));
        /**
         * 等待delay毫秒后首次执行
         * 之后每隔period毫秒重复执行一次task
         */
//        myTimerTask.setName("schedule4");
//        timer.schedule(myTimerTask,3000,1000);

        /**
         * 时间等于或超过time时首次执行task
         * 之后每隔period毫秒重复执行一次task
         */
//        myTimerTask.setName("scheduleAtFixedRate1");
//        timer.scheduleAtFixedRate(myTimerTask,calendar.getTime(),2000);
        /**
         * 等待delay毫秒后首次执行task
         * 之后每隔period毫秒重复执行一次task
         */
//        myTimerTask.setName("scheduleAtFixedRate2");
//        timer.scheduleAtFixedRate(myTimerTask,3000,1000);

    }
}
