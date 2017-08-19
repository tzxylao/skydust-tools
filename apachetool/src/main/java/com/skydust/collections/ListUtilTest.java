package com.skydust.collections;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by laoliangliang on 2017/5/22.
 */
public class ListUtilTest {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        List<Object> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("4");
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
//        list.add(4);
        //1、验证list对象符合某种规则，否则报错
        List list4 = ListUtils.predicatedList(list, new Predicate() {
            @Override
            public boolean evaluate(Object object) {
                if (object instanceof String) {
                    return true;
                }
                return false;
            }
        });
        System.out.println(StringUtils.arrayToDelimitedString(list4.toArray(new String[]{}),","));

        List<Object> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("5");
        list1.add("3");
        //2、合并两个数组，不存在相同值
        List sum = ListUtils.sum(list1, list2);
        System.out.println(sum);
        //3、验证list对象符合某种规则，符合的返回新的过滤后的集合
        Collection select = CollectionUtils.select(list, new Predicate() {
            @Override
            public boolean evaluate(Object object) {
                if(String.valueOf(object).equals("1")){
                    return true;
                }
                return false;
            }
        });
        System.out.println(list1.toArray(new String[]{}));
        System.out.println(StringUtils.arrayToDelimitedString(list1.toArray(new String[]{}),","));
        System.out.println(ArrayUtils.toString(list1.toArray()));
        //4、分割集合n个为一组
        UnmodifiableIterator<List<Object>> partition = Iterators.partition(list1.iterator(), 2);
        List<Object> next = partition.next();
        List<Object> next1 = partition.next();
        System.out.println(next1.get(0));

        //5、集合中出现频次
        int frequency = Iterators.frequency(list1.iterator(), "3");
        System.out.println(frequency);
        String str = null;
        Preconditions.checkNotNull(str,"null Point");
    }
}
