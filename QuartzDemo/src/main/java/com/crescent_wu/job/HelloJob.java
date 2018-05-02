package com.crescent_wu.job;

import org.quartz.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloJob implements Job{
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        Date date = new Date();

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("current time is " + sf.format(date));

//        System.out.println("Hello World!");

        Trigger currentTrigger = jobExecutionContext.getTrigger();

        System.out.println("start time is " + sf.format(currentTrigger.getStartTime()));

        System.out.println("end time is " + sf.format(currentTrigger.getEndTime()));

        JobKey jobKey = currentTrigger.getJobKey();

        System.out.println("job key info --- jobName " + jobKey.getName()+" jobGroup "+jobKey.getGroup());

    }
}
