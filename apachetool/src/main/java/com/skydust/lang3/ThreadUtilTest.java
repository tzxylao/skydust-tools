package com.skydust.lang3;

import org.apache.commons.lang3.ThreadUtils;

import java.util.Collection;

/**
 * 线程工具类，可以获得正在运行的线程相关信息
 * Created by laoliangliang on 17/5/21.
 */
public class ThreadUtilTest {
    public static void main(String[] args) {
        Collection<ThreadGroup> allThreads = ThreadUtils.getAllThreadGroups();
        for (ThreadGroup allThread : allThreads) {
            System.out.println(allThread);
        }
        System.out.println("------------------");
        Collection<Thread> allThreads1 = ThreadUtils.getAllThreads();
        for (Thread allThread : allThreads1) {
            System.out.println(allThread.getName());
        }
        System.out.println("------------------");
        Collection<Thread> threadsByName = ThreadUtils.findThreadsByName("main");
        for (Thread thread : threadsByName) {
            System.out.println(thread);
        }
    }
}
