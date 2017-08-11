package com.skydust.guava;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

import java.util.Objects;

import static com.google.common.base.Preconditions.checkNotNull;
import static java.util.Objects.requireNonNull;


/**
 * Created by laoliangliang on 2017/6/14.
 */
public class PreconditionsTest {
    private Integer a;

    private String b;

    private String c;


    public static void main(String[] args) {
        //1、检查参数是否为null，null则直接抛出null异常
        System.out.println(checkNotNull("xxx"));
        System.out.println(requireNonNull("xxx"));

        //2、比较两对象是否相同
        PreconditionsTest t1 = new PreconditionsTest();
        t1.a = 1;
        t1.b = "2";
        t1.c = "3";
        PreconditionsTest t2 = new PreconditionsTest();
        t2.a = 1;
        t2.b = "2";
        t2.c = "3";
        System.out.println(t1.compareTo(t2));
        //3、比较两对象，不需要考虑null值问题
        /*
        Objects.equal("a", "a"); // returns true
        Objects.equal(null, "a"); // returns false
        Objects.equal("a", null); // returns false
        Objects.equal(null, null); // returns true
         */
        System.out.println(Objects.equals(t1, t2));

        Ordering<Integer> ord = new Ordering<Integer>() {
            @Override
            public int compare(Integer left, Integer right) {
                return left-right;
            }
        };
    }

    public int compareTo(PreconditionsTest that) {
        return ComparisonChain.start()
                .compare(this.a, that.a)
                .compare(this.b, that.b)
                .compare(this.c, that.c, Ordering.natural().nullsLast())
                .result();
    }

}
