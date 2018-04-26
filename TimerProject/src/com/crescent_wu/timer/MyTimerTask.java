package com.crescent_wu.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask{

    private String name;
    private Integer count = 0;
    /**
     * The action to be performed by this timer task.
     */
    @Override
    public void run() {
        if (count<3){
            //以yyyy-MM-dd HH:mm:ss的格式打印当前执行时间
            Calendar calendar = Calendar.getInstance();

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            System.out.println("Current exec time is:"+ simpleDateFormat.format(calendar.getTime()));

            System.out.println("Current exec name is:"+ name);

            count++;

        }else {

            cancel();

            System.out.println("Task cancel!");

        }
    }

    public MyTimerTask(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
