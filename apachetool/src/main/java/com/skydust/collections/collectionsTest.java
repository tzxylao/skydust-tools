package com.skydust.collections;

import com.skydust.bean.Person;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by laoliangliang on 17/5/21.
 */
public class collectionsTest {
    public static void main(String[] args) {
        Person p = new Person();
        Collection<Person> coll = new ArrayList<>();
        coll.add(new Person().setAge(22));
        String str = "123";
        Collection<String> collPerson = new ArrayList<>();
        collPerson.add("123");
        collPerson.add("123");
        collPerson.add("1234");
        //判断对象在集合中出现的次数
        int cardinality = CollectionUtils.cardinality(str, collPerson);
        System.out.println(cardinality);
        System.out.println(p);
    }
}
