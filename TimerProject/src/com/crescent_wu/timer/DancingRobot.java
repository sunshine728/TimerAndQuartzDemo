package com.crescent_wu.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class DancingRobot extends TimerTask{
    /**
     * The action to be performed by this timer task.
     */
    @Override
    public void run() {
        //获取最近的一次任务执行的时间，并将其格式化
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println( "schedule exec time is: " +simpleDateFormat.format(calendar.getTime()));
        System.out.println("Dancing happy!");
    }
}
