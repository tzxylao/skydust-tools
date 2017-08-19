package com.skydust.collections;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.*;
import com.skydust.bean.Person;

import java.util.*;

/**
 * Created by laoliangliang on 2017/8/11.
 */
public class MapsTest {
    public static void main(String[] args) {
        testTable();
        //拼接数组
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("22");
        list.add("3444");
//        list.add(null);
        String haha = Joiner.on(";").useForNull("haha").join(list.iterator());
        System.out.println(haha);
        ImmutableMap<Object, String> objectStringImmutableMap = Maps.uniqueIndex(list, new Function<String, Object>() {
            @Override
            public Object apply(String input) {
                return input.length();
            }
        });
        String s = objectStringImmutableMap.get(3);
        System.out.println(s);
        //把list，根据自己的判断，转换成任意对象
        List<Object> transform = Lists.transform(list, new Function<String, Object>() {
            @Override
            public Object apply(String input) {
                return input.length();
            }
        });
        System.out.println(Arrays.toString(transform.toArray()));
        Map<String, Object> map = new HashMap<>();
        map.put("a-k", "a-v");
        map.put("b-k", "b-v");
        map.put("c-k", "c-v");
        MapDifference<String, Object> difference = Maps.difference(map, map);
        SetMultimap<String, Object> map1 = Multimaps.forMap(map);
        //转换map的value值
        Multimap<String, Object> stringObjectMultimap = Multimaps.transformValues(map1, new Function<Object, Object>() {
            @Override
            public Object apply(Object input) {
                return ((String) input).startsWith("a");
            }
        });
        System.out.println(stringObjectMultimap);
        mapbiTest();
        //拼接map
        Joiner.MapJoiner mapJoiner = Joiner.on(";").withKeyValueSeparator("->");
        String join = mapJoiner.join(map);
        System.out.println(join);
    }

    public static void mapbiTest() {
        //双向map，key，value都可作为key值
        BiMap<String, String> weekNameMap = HashBiMap.create();
        weekNameMap.put("星期一", "Monday");
        weekNameMap.put("星期二", "Tuesday");
        weekNameMap.put("星期三", "Wednesday");
        weekNameMap.put("星期四", "Thursday");
        weekNameMap.put("星期五", "Friday");
        weekNameMap.put("星期六", "Saturday");
        weekNameMap.put("星期日", "Sunday");
        System.out.println("星期日的英文名是" + weekNameMap.get("星期日"));
        System.out.println("Sunday的中文是" + weekNameMap.inverse().get("Sunday"));
    }


    //相当于有两个key的map
    private static void testTable() {
        Table<Integer, Integer, Person> personTable = HashBasedTable.create();
        personTable.put(1, 20, new Person());
        personTable.put(0, 30, new Person());
        personTable.put(0, 25, new Person());
        personTable.put(1, 50, new Person());
        personTable.put(0, 27, new Person());
        personTable.put(1, 29, new Person());
        personTable.put(0, 33, new Person());
        personTable.put(1, 66, new Person());

        //1,得到行集合
        Map<Integer, Person> rowMap = personTable.row(0);
        int maxAge = Collections.max(rowMap.keySet());
        System.out.println(maxAge);
    }
}
