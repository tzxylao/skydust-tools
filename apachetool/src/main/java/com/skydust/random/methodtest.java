package com.skydust.random;

import com.skydust.bean.Apple;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by laoliangliang on 2017/5/25.
 */
public class methodtest {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        delelteList(list);
        for (Object o : list) {
            System.out.print(o+" ");
        }

        List<String> mylist = new ArrayList<>();
        mylist.add("e");
        changeMyList(mylist);
        for (String s : mylist) {
            System.out.println(s);
        }

        BigDecimal decimal = BigDecimal.ZERO;
        changeBigDecimal(decimal);

        Apple apple = new Apple();
        apple.setColor("red");
        apple.setId("1");
        changeApple(apple);
        System.out.println(apple);

        String bar = new String("123");
        changeString(bar);
        System.out.println(bar);
    }

    private static void changeString(String bar) {
        bar = "456";
    }

    private static void changeApple(Apple apple) {
        apple.setColor("green");
        apple.setId("2");
    }

    private static void changeBigDecimal(BigDecimal decimal) {
        decimal = decimal.add(BigDecimal.ONE);
    }

    private static void changeMyList(List<String> mylist) {
        mylist.add("h");
    }

    public static void change(BigDecimal amount,Integer n){
        amount = amount.add(BigDecimal.ONE);
        n = new Integer("2");
    }

    public static void delelteList(List list){
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            Object next =  iterator.next();
//            iterator.remove();
        }
    }
}
