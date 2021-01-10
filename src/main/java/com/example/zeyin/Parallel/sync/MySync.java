package com.example.zeyin.Parallel.sync;


/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月10日 15:41
 * @Modify:
 */
public class MySync {

    public static synchronized void method1() {
        System.out.println("线程安全，静态方法");
    }

    public synchronized void method2() {
        System.out.println("线程安全，普通方法");
    }

    public synchronized void method3() {
        System.out.println("线程不安全，普通方法");
    }
}
