package com.skydust.configuration;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.SystemUtils;

/**
 * Created by laoliangliang on 2017/5/23.
 */
public class PropertiesConfigurationTest {
    public static void main(String[] args) throws ConfigurationException {
        //获取properties文件各属性值，设置key-value值
        PropertiesConfiguration config = new PropertiesConfiguration(SystemUtils.USER_DIR+"\\apachetool\\src\\main\\resources\\log4j.properties");
        String basePath = config.getBasePath();
        System.out.println(basePath);
        String encoding = config.getEncoding();
        System.out.println(encoding);
        config.setProperty("test","test");
        config.save();
        System.out.println(config.getProperty("log4j.appender.console"));
        System.out.println(config.getPath());
        config.addProperty("test2","test2");
        config.save();
    }
}
