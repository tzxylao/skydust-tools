package com.skydust.event;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.skydust.bean.Apple;

/**
 * Created by laoliangliang on 2017/8/15.
 */
public class EventTest {
    public static void main(String[] args) {
        new Object() {

            @Subscribe
            public void listern(Integer integer) {
                System.out.printf("%d from int%n", integer);
            }
        };

        final EventBus eventBus = new EventBus();
        eventBus.register(new Object() {

            @Subscribe
            public void listern(Integer integer) {
                System.out.printf("%s from int%n", integer);
            }

            @Subscribe
            public void listern(Number integer) {
                System.out.printf("%s from Number%n", integer);
            }

            @Subscribe
            public void listern(Long integer) {
                System.out.printf("%s from long%n", integer);
            }

            @Subscribe
            public void listern(DeadEvent event) {
                System.out.printf("%s=%s from dead events%n", event.getSource().getClass(), event.getEvent());
            }
        });

        Apple apple = new Apple(eventBus);
        eventBus.post(1);
        eventBus.post(1L);
        eventBus.post(new Object());
    }
}
