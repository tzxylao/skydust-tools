package com.skydust;

import com.skydust.task.MyTimerTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by laoliangliang on 17/6/3.
 */
public class MainRun {
    private static Logger log = LoggerFactory.getLogger(MainRun.class);


    public static void main(String[] args) {
        log.info("开始定时任务");
        //开始定时任务
        try {
            MyTimerTask.analyzeData();
        } catch (IOException e) {
            log.error("运行错误", e);
        }
    }
}
