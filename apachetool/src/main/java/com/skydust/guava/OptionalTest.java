package com.skydust.guava;

import com.google.common.base.Objects;
import com.google.common.base.Optional;

/**
 * Created by laoliangliang on 2017/6/14.
 */
public class OptionalTest {
    public static void main(String[] args) {
        //1、如果第一个对象为null，返回第二个对象
        String xxx = Objects.firstNonNull(null, "Xxx");
        System.out.println(xxx);

        Integer i = 8;
//        i = null;
        //创建指定引用的Optional实例，若引用为null则快速失败
        Optional<Integer> op = Optional.of(i);
        //op为空，报illegalState异常
        System.out.println(op.get());
        //op为空，则返回9
        System.out.println(op.or(9));
        //op为空，报null指针异常
        System.out.println(op.orNull());
        //op为空，返回false 否则ture
        System.out.println(op.isPresent());
        //op为空，返回空集合，否则返回单一集合
        System.out.println(op.asSet());
        System.out.println(Objects.toStringHelper("9").addValue(8).toString());
    }
}
