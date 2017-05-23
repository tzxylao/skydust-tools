package com.skydust.collections;

import com.skydust.bean.Person;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.OrderedMap;
import org.apache.commons.collections.map.LinkedMap;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by laoliangliang on 17/5/21.
 */
public class collectionsTest {
    public static void main(String[] args) {
        Person p = new Person();
        Collection<Person> coll = new ArrayList<>();
        Person person = new Person();
        person.setAge(22);
        coll.add(person);
        String str = "123";
        Collection<String> collPerson = new ArrayList<>();
        collPerson.add("123");
        collPerson.add("123");
        collPerson.add("1234");
        //1、判断对象在集合中出现的次数
        int cardinality = CollectionUtils.cardinality(str, collPerson);
        System.out.println(cardinality);
        System.out.println(p);
        //2、OrderedMap
        OrderedMap map = new LinkedMap();
        map.put("FIVE", "5");
        map.put("SIX", "6");
        map.put("SEVEN", "7");
        map.firstKey(); // returns "FIVE"
        Object fiveNext = map.nextKey("FIVE");// returns "SIX"
        System.out.println(fiveNext);
    }
}
