package com.skydust.collections;

import com.skydust.bean.Subject;
import org.apache.commons.collections.ListUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by laoliangliang on 2017/5/25.
 */
public class ListUtilsTest2 {
    public static void main(String[] args) {
        List<Subject> list = new ArrayList<>();
        Subject subject = new Subject();
        subject.setSubject_id("1");
        subject.setRaise_surplus_amount(new BigDecimal("10"));
        list.add(subject);
        subject = new Subject();
        subject.setSubject_id("2");
        subject.setRaise_surplus_amount(new BigDecimal("11"));
        list.add(subject);
        subject = new Subject();
        subject.setSubject_id("3");
        subject.setRaise_surplus_amount(new BigDecimal("12"));
        list.add(subject);
        List<Subject> list2 = new ArrayList<>();
        subject = new Subject();
        subject.setSubject_id("1");
        subject.setRaise_surplus_amount(new BigDecimal("13"));
        list2.add(subject);
        subject = new Subject();
        subject.setSubject_id("2");
        subject.setRaise_surplus_amount(new BigDecimal("14"));
        list2.add(subject);
        subject = new Subject();
        subject.setSubject_id("4");
        subject.setRaise_surplus_amount(new BigDecimal("15"));
        list2.add(subject);
        List list3 = ListUtils.removeAll(list, list2);
        for (Object o : list3) {
            System.out.println(o);
        }
        System.out.println("---------------------");
        List list5 = ListUtils.retainAll(list, list2);
        for (Object o : list5) {
            System.out.println(o);
        }
        System.out.println("---------------------");
    }
}
