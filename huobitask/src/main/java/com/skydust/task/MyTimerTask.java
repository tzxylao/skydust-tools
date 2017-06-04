package com.skydust.task;

import com.skydust.util.SetSystemProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Timer;

/**
 * Created by laoliangliang on 17/6/3.
 */
public class MyTimerTask {

    private static Logger log = LoggerFactory.getLogger(MyTimerTask.class);

    public static void analyzeData() throws IOException {
        SetSystemProperty.writeProperties("buy_price", "0.0");
        SetSystemProperty.writeProperties("sell_price", "0.0");
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TaskTwo(), 0, 10000);
    }

    public static void main(String[] args) {
        log.info("xxxx\n\rassd");
    }
}
