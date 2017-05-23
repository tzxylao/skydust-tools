package com.skydust.collections;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.Predicate;
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
//        list.add(4);
        //1、验证list对象符合某种规则，否则报错
        List list2 = ListUtils.predicatedList(list, new Predicate() {
            @Override
            public boolean evaluate(Object object) {
                if (object instanceof String) {
                    return true;
                }
                return false;
            }
        });
        System.out.println(StringUtils.arrayToDelimitedString(list2.toArray(new String[]{}),","));

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
        System.out.println(StringUtils.arrayToDelimitedString(select.toArray(new String[]{}),","));
    }
}
