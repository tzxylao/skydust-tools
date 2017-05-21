package com.skydust.lang3;

import org.apache.commons.lang3.SystemUtils;

import java.io.File;

/**
 * System相关工具，可以用来获取
 * javaHome地址相关
 * userDir目录
 * 判断java版本
 * 判断用户电脑系统等
 * Created by laoliangliang on 17/5/21.
 */
public class SystemUtilTest {
    public static void main(String[] args) {
        File javaHome = SystemUtils.getJavaHome();
        System.out.println(javaHome.getAbsolutePath());
        System.out.println(javaHome.getName());
        System.out.println(SystemUtils.getJavaIoTmpDir());
        System.out.println(SystemUtils.getUserDir());
        System.out.println(SystemUtils.getUserHome());
        System.out.println(SystemUtils.IS_JAVA_1_8);
        System.out.println(SystemUtils.IS_OS_MAC_OSX_EL_CAPITAN);
        System.out.println(SystemUtils.IS_OS_MAC_OSX);
        System.out.println(SystemUtils.IS_OS_MAC_OSX_CHEETAH);
    }
}
