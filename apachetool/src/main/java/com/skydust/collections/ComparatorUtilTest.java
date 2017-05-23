package com.skydust.collections;

import org.apache.commons.collections.ComparatorUtils;

import java.util.Comparator;

/**
 * Created by laoliangliang on 2017/5/23.
 */
public class ComparatorUtilTest {
    public static void main(String[] args) {
        //比较对象大小
        Object max = ComparatorUtils.max(1, 2, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (int)o1 - (int)o2;
            }
        });
        System.out.println(max);
        //使用自然序列排序，用于自然数，字符串等
        max = ComparatorUtils.max("1", "2", ComparatorUtils.naturalComparator());
        System.out.println(max);
    }
}
