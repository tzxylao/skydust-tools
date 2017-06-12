package com.skydust.lang;

import org.apache.commons.lang.StringUtils;

/**
 * Created by laoliangliang on 2017/6/12.
 */
public class StringUtilsTest {
    public static void main(String[] args) {
        //1、已asdf为中心，用-填充100个字符
        String center = StringUtils.center("asdf", 100, "-");
        System.out.println(center);
    }
}
