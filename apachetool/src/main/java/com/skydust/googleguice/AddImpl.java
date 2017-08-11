package com.skydust.googleguice;

/**
 * Created by laoliangliang on 2017/6/20.
 */
public class AddImpl implements Add {
    @Override
    public void add(int i) {
        System.out.println(i);
    }
}
