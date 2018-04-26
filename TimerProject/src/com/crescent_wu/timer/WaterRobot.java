package com.crescent_wu.timer;

import java.util.Timer;
import java.util.TimerTask;

public class WaterRobot extends TimerTask {
    /**
     * The action to be performed by this timer task.
     */
    private Timer timer;
    //最大容量5L
    private Integer bucketCapacity = 0;

    public WaterRobot(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        //灌水直至桶满为止
        if(bucketCapacity == 5){
            System.out.println("The number of canceled task in timer is "+timer.purge());
            cancel();
            System.out.println("The waterRobot has been aborted!");
            System.out.println("The number of canceled task in timer is "+timer.purge());
            System.out.println("Current water is "+bucketCapacity +"L");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timer.cancel();
        }else{
            System.out.println("Add 1L water into the bucket!");

            bucketCapacity++;
        }
    }
}
