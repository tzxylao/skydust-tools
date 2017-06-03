package com.skydust.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by laoliangliang on 17/6/3.
 */
public class propertyUtil {
    public static Properties prop;

    static {
        try {
            InputStream resourceAsStream = propertyUtil.class.getClassLoader().getResourceAsStream("config.properties");
            prop = new Properties();
            prop.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProp(String key) {
        return prop.getProperty(key);
    }

    public static void main(String[] args) {
        String prop = getProp("ratio.low");
        System.out.println(prop);
    }
}
