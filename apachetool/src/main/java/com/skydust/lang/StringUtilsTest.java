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
        //2、约定可显示字符串长度，超过该长度用...代替
        String shanghai = StringUtils.abbreviate("shanghai", 7);
        System.out.println(shanghai);
        //3、末尾是换行符则删除，否则不删
        System.out.println(StringUtils.chomp("asdfg\r\n"));
        //4、删除空字符串
        System.out.println(StringUtils.deleteWhitespace("asd afd af ewre   ewq"));
        //5、取出不同部分
        System.out.println(StringUtils.difference("wshaf", "wshaeqhhgs"));
        //6、去除最后一个字符，包括(\n\r)
        System.out.println(StringUtils.chop("afdsaf华富大厦"));
        //7、以空格填充左边位置满10位
        System.out.println(StringUtils.leftPad("Xxxsa", 10));
        //8、去除左右空格
        System.out.println(StringUtils.strip("  adf as  "));
        System.out.println(StringUtils.trim("  adf as  "));
        //9、大小写转换
        System.out.println(StringUtils.swapCase("xadsfDSF"));
        //10、从给定字符开始切到末尾
        System.out.println(StringUtils.substringAfter("fdas,fgre,g", ","));
        System.out.println(StringUtils.substringAfterLast("fdas,fgre,g", ","));
    }
}
