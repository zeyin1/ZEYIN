package com.example.zeyin.Parallel;

import com.example.zeyin.Parallel.thread.MyThread1;
import com.example.zeyin.Parallel.thread.MyThread2;
import com.example.zeyin.Parallel.thread.MyThread3;
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

    /**
     * @Description: 一个线程不能多次start
     * @Author: zeyin
     * @Date: 2021/1/10 15:30
     */
    @Test
    public void myThreadTest2() {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        myThread2.start();
    }

    /**
     * @Description: 一个可以多次run
     * @Author: zeyin
     * @Date: 2021/1/10 15:32
     */
    @Test
    public void myThreadTest21() {
        MyThread2 myThread2 = new MyThread2();
        myThread2.run();
        myThread2.run();
    }

    @Test
    public void myThreadTest3() {
        MyThread1 myThread1 = new MyThread1();
        myThread1.run();
        myThread1.run();
    }

    @Test
    public void myThreadTest4() {
        MyThread3 myThread3 = new MyThread3();
        myThread3.call();
        myThread3.call();
    }
}
