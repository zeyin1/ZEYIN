package com.example.zeyin.Parallel;

import java.util.concurrent.Callable;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月10日 15:18
 * @Modify:
 */
public class MyThread3 implements Callable {
    @Override
    public Boolean call() {
        System.out.println("Callable方法，创建线程");
        return true;
    }
}
