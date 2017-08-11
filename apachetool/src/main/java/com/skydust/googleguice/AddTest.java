package com.skydust.googleguice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by laoliangliang on 2017/6/20.
 */
public class AddTest {
    public static void main(String[] args) {
        //绑定接口和类
        Injector injector = Guice.createInjector(new AddModlue());
        //使用接口实现绑定实现类
        Add add = injector.getInstance(Add.class);
        //调用实现类方法
        add.add(9);
    }
}
