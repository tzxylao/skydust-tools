package com.skydust.event;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * Created by laoliangliang on 2017/8/15.
 */
public class EventTest {
    public static void main(String[] args) {
        new Object() {

            @Subscribe
            public void lister(Integer integer) {
                System.out.printf("%d from int%n", integer);
            }
        };

        final EventBus eventBus = new EventBus();
        eventBus.register(new Object() {

            @Subscribe
            public void lister(Integer integer) {
                System.out.printf("%s from int%n", integer);
            }

            @Subscribe
            public void lister(Number integer) {
                System.out.printf("%s from Number%n", integer);
            }

            @Subscribe
            public void lister(Long integer) {
                System.out.printf("%s from long%n", integer);
            }

            @Subscribe
            public void lister(DeadEvent event) {
                System.out.printf("%s=%s from dead events%n", event.getSource().getClass(), event.getEvent());
            }
        });

        eventBus.post(1);
        eventBus.post(1L);
        eventBus.post(new Object());
    }
}
