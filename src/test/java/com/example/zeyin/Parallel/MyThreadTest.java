package com.example.zeyin.Parallel;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月10日 15:22
 * @Modify:
 */
@SpringBootTest
public class MyThreadTest {

    @Test
    public void myThreadTest1() {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        MyThread3 myThread3 = new MyThread3();
        myThread1.run();
        myThread2.start();
        Boolean res = myThread3.call();
        System.out.println("call方法返回的结果：" + res);
    }
}
