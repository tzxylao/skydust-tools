package com.skydust.googleguice;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Created by laoliangliang on 2017/6/20.
 */
public class AddModlue implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(Add.class).to(AddImpl.class);
    }
}
