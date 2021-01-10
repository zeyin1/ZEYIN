package com.example.zeyin.Parallel;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月10日 15:18
 * @Modify:
 */
public class MyThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable方法，创建线程");
    }
}
