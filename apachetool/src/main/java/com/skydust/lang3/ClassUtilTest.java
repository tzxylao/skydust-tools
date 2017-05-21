package com.skydust.lang3;

import com.skydust.bean.Person;
import org.apache.commons.lang3.ClassUtils;

/**
 * Created by laoliangliang on 17/5/21.
 */
public class ClassUtilTest {
    public static void main(String[] args) {
        Person p = new Person();
        //拿到一个类缩写的名字
        String abbreviatedName = ClassUtils.getAbbreviatedName(p.getClass(), 2);
        System.out.println(abbreviatedName);
    }
}
