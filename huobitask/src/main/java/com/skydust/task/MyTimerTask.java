package com.skydust.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Timer;

/**
 * Created by laoliangliang on 17/6/3.
 */
public class MyTimerTask {

    private static Logger log = LoggerFactory.getLogger(MyTimerTask.class);

    public static void analyzeData() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TaskOne(), 0, 10000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    log.info("运行正常！！！");
                    try {
                        Thread.sleep(600000);
                    } catch (Exception e) {
                    }
                }
            }
        }).start();
    }
}
