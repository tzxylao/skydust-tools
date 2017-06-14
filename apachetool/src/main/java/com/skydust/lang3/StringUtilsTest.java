package com.skydust.lang3;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by laoliangliang on 2017/6/14.
 */
public class StringUtilsTest {
    public static void main(String[] args) {
        //1、字符串数组相同开头取出
        System.out.println(StringUtils.getCommonPrefix("xxaf", "xxawe", "xfgfd"));
    }
}
