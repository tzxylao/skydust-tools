package com.skydust.lang3;

import com.skydust.bean.Person;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Field;

/**
 * Created by laoliangliang on 17/5/20.
 */
public class fieldUtilTest {
    public static void main(String[] args) throws IllegalAccessException {
        Person p = new Person();
        //作用为获取类所有字段域，包括所有父类
        Field[] allFields = FieldUtils.getAllFields(p.getClass());
        allFields[0].setAccessible(true);
        allFields[0].set(p, "wo");
        System.out.println(p);
        Field[] declaredFields = p.getClass().getDeclaredFields();
        declaredFields[0].setAccessible(true);
        declaredFields[0].set(p, "shi");
        System.out.println(p);
    }
}
