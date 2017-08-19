package com.skydust.order;

import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.skydust.bean.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by laoliangliang on 2017/8/17.
 */
public class OrderTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setUsername("zhagnsan");
        user1.setAge(22);
        user1.setPassword("123");
        User user2 = new User();
        user2.setUsername("aisi");
        user2.setAge(2);
        user2.setPassword("123");
        User user3 = new User();
        user3.setUsername("wangwu");
        user3.setAge(56);
        user3.setPassword("123");
        List<User> us = new ArrayList<User>();
        us.add(user1);
        us.add(user2);
        us.add(user3);
        //创建ordering实例，并编写排序规则
        Ordering<User> ordering = new Ordering<User>() {

            @Override
            public int compare(User u1, User u2) {
                return Ints.compare(u1.getAge(), u2.getAge());
            }
        };
        Collections.sort(us, ordering);
        for (User user : us) {
            System.out.println(user.getUsername() + "..." + user.getAge() + "..." + user.getPassword());
        }
    }
}
