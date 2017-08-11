package com.skydust.date;


import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

/**
 * Created by laoliangliang on 2017/6/15.
 */
public class DateUtilsTest {
    public static void main(String[] args) {
        //1、日期增加天数
        Date date = DateUtils.addDays(new Date(), 175);
        String dateformat = DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dateformat);
        //2、设置日期小时
        Date dateNew = DateUtils.setHours(date, 0);
        System.out.println(DateFormatUtils.format(dateNew, "yyyy-MM-dd HH:mm:ss"));
        //3、判断日期是否同一天
        System.out.println(DateUtils.isSameDay(date, dateNew));
    }
}
