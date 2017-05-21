package com.skydust.beanutil;

import com.skydust.bean.Apple;
import com.skydust.bean.Hand;
import com.skydust.bean.Person;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by laoliangliang on 17/5/20.
 */
public class beanUtilTest {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Person p = new Person();
        Hand hand = new Hand();
        hand.setColor("white");
        p.setHand(hand);
        p.setAge(21);
        System.out.println(p);
        System.out.println(System.identityHashCode(p));
        //拷贝对象
        Person o = (Person) BeanUtils.cloneBean(p);
        System.out.println(o);
        System.out.println(System.identityHashCode(o));
        Person p2 = new Person();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", 23);
        map.put("hand", new Hand().setColor("red").setFinger("five"));
        BeanUtils.populate(p2, map);
        //为什么p2赋不了值，下面的apple能赋值
        System.out.println(p2);
        Apple apple = new Apple();
        Map<String, Object> appleMap = new HashMap<>();
        appleMap.put("id", "1");
        appleMap.put("color", "red");
        //将map值赋给对象，不需要再一个个赋值了
        BeanUtils.populate(apple, appleMap);
        System.out.println(apple);
        //对象转换成map
        Map<String, String> describe = BeanUtils.describe(apple);
        Set<Map.Entry<String, String>> entries = describe.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

    }
}
