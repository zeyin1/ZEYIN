package com.example.zeyin.problem;

import java.math.BigDecimal;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月16日 10:00
 * @Modify:
 */
public class ProOfBigDecimal {

    public static void method1() {
        System.out.println(0.05 + 0.01);
        System.out.println(1.0 - 0.42);
        System.out.println(4.015 * 100);
        System.out.println(123.3 / 100);
    }

    /**
     * （1）BigDecimal类的double类型参数构造器只能计算的无限接近这个数，但是无法精确到这个数。
     * （2）想准确计算这个值，那么需要把double类型的参数转化为String类型的。
     * 并且使用BigDecimal(String)这个构造方法进行构造。去获取结果
     */
    public static void method2() {
        //精度会丢失
        BigDecimal a = new BigDecimal(1.01);
        BigDecimal b = new BigDecimal(1.02);

        //精度不会丢失
        BigDecimal c = new BigDecimal("1.01");
        BigDecimal d = new BigDecimal("1.02");
        System.out.println(a.add(b));
        System.out.println(c.add(d));
    }
}
