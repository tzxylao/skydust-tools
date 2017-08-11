package com.skydust.math;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by laoliangliang on 2017/6/13.
 */
public class MathTest {
    public static void main(String[] args) {
        /*BigDecimal sum = new BigDecimal("300");
        for (int i = 0; i < 900; i++) {
            BigDecimal start = BigDecimal.ONE.divide(new BigDecimal("3"),12,BigDecimal.ROUND_HALF_UP);
            sum = sum.subtract(start);
            System.out.println(sum);
        }*/
        BigDecimal b = new BigDecimal("0.0000000", MathContext.DECIMAL32);
        BigDecimal a = new BigDecimal("0.0000000");
        System.out.println(b.toString());
        System.out.println(a.toString());
    }
}
