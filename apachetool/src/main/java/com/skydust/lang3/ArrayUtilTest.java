package com.skydust.lang3;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/**
 * Created by laoliangliang on 17/5/21.
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        //删除字符串中特定字母
        String str = "I like Apple";
        char[] ls = ArrayUtils.removeElements(str.toCharArray(), 'l');
        System.out.println(Arrays.toString(ls));
        char[] ls1 = ArrayUtils.removeAllOccurences(str.toCharArray(), 'l');
        System.out.println(String.valueOf(ls1));
    }
}
