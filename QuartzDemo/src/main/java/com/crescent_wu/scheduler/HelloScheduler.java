package com.crescent_wu.scheduler;

import com.crescent_wu.job.HelloJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloScheduler {
    public static void main(String[] args) throws SchedulerException {
        Date date = new Date();

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("current time is " + sf.format(date));
        //创建一个jobDetail实例，将该实例与HelloClass绑定
        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
                .withIdentity("myJob","group1").build();
       //获取距离当前时间3秒后的时间
//        date.setTime(date.getTime()+3000);
//        Date endDate = new Date();
//        endDate.setTime(endDate.getTime()+6000);

        //创建一个Trigger实例，定义该job立即执行并每隔两秒重复执行一次，直到永远
        Trigger trigger = TriggerBuilder.newTrigger().
                withIdentity("myTrigger","group1")
//                .startAt(date)
//                .endAt(endDate)
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(2).repeatForever())
 .build();
        //创建Scheduler实例
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.start();
//        Date date = new Date();
//
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        System.out.println("current time is " + sf.format(date));
        scheduler.scheduleJob(jobDetail,trigger);

    }
}
