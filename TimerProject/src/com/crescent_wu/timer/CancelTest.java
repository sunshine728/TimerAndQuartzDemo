package com.crescent_wu.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class CancelTest {

    public static void main(String[] args) throws InterruptedException {

        Timer timer = new Timer();
        MyTimerTask task1 = new MyTimerTask("task1");
        MyTimerTask task2 = new MyTimerTask("task2");
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("start time is:"+ simpleDateFormat.format(date));
        timer.schedule(task1,3000,2000);
        timer.schedule(task2,1000,2000);
        System.out.println("current canceled task number is:"+ timer.purge());

        Thread.sleep(2000);

        Date cancelTime = new Date();
        System.out.println("cancel time is:"+ simpleDateFormat.format(cancelTime));
        task2.cancel();
        System.out.println("Tasks all canceled ");
        System.out.println("current canceled task number is:"+ timer.purge());

    }

}
