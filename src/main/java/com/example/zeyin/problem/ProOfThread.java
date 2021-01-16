package com.example.zeyin.problem;

import java.util.concurrent.CountDownLatch;

/**
 * @Description: 本文章参考wingjay所著，仅供学习
 * @Author: zeyin
 * @Date: 2021年01月16日 10:20
 * @Modify:
 */
public class ProOfThread {

    /**
     * @Description: 线程学习（使用CountDownLatch，多个线程嵌套执行）
     * 四个线程 A B C D，其中 D 要等到 A B C 全执行完毕后才执行，而且 A B C 是同步运行的
     * (1)创建一个计数器，设置初始值，CountdownLatch countDownLatch = new CountDownLatch(2);
     * (2)在 等待线程 里调用 countDownLatch.await() 方法，进入等待状态，直到计数值变成 0；
     * (3)在 其他线程 里，调用 countDownLatch.countDown() 方法，该方法会将计数值减小 1；
     * (4)当 其他线程 的 countDown() 方法把计数值变成 0 时，等待线程 里的 countDownLatch.await() 立即退出，继续执行下面的代码。
     * @Author: zeyin
     * @Date: 2021/1/16 10:34
     */
    public static void runDAfterABC() {

        int worker = 3;//三个线程并发执行
        CountDownLatch countDownLatch = new CountDownLatch(worker);

        //等待线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("D is waiting for other three threads");
                try {
                    //该线程处于等待状态。等到计数器为0时，执行
                    countDownLatch.await();
                    System.out.println("All done, D starts working");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("D finished");
            }
        }).start();

        //其他线程（三个并发线程）
        for (char threadName='A'; threadName <= 'C'; threadName++) {
            final String tN = String.valueOf(threadName);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(tN + " is working");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(tN + " finished");
                    //计数器减一
                    countDownLatch.countDown();
                }
            }).start();
        }
    }

    /**
     * @Description: 线程学习（使用wait/notify，两个线程嵌套执行）
     * 希望 A 在打印完 1 后，再让 B 打印 1, 2, 3，最后再回到 A 继续打印 2, 3。
     * (1)首先创建一个 A 和 B 共享的对象锁 lock = new Object();
     * (2)当 A 得到锁后，先打印 1，然后调用 lock.wait() 方法，交出锁的控制权，进入 wait 状态；
     * (3)对 B 而言，由于 A 最开始得到了锁，导致 B 无法执行；直到 A 调用 lock.wait() 释放控制权后， B 才得到了锁；
     * (4)B 在得到锁后打印 1， 2， 3；然后调用 lock.notify() 方法，唤醒正在 wait 的 A;
     * (5)A 被唤醒后，继续打印剩下的 2，3。
     * @Author: zeyin
     * @Date: 2021/1/16 10:29
     */
    public static void demo3() {
        //公共锁
        Object lock = new Object();

        //线程A
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("A 1");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("A 2");
                    System.out.println("A 3");
                }
            }
        });

        //线程B
        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("B 1");
                    System.out.println("B 2");
                    System.out.println("B 3");
                    lock.notify();
                }
            }
        });
        A.start();
        B.start();
    }

    /**
     * @Description: 线程学习（使用join，两个线程有序执行）
     * @Author: zeyin
     * @Date: 2021/1/16 10:20
     */
    public static void demo2() {
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                print("A");
            }
        });

        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("B 开始等待 A");
                try {
                    //等待A线程执行结束后才执行B线程，A.join() 方法会让 B 一直等待直到 A 运行完毕
                    A.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                print("B");
            }
        });

        A.start();
        B.start();
    }
    /**
     * @Description: 线程学习（开启两个线程）
     * @Author: zeyin
     * @Date: 2021/1/16 10:20
     */
    public static void demo1() {
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                print("A");
            }
        });

        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                print("B");
            }
        });

        A.start();
        B.start();
    }

    private static void print(String threadName) {
        int i=0;
        while (i++ < 3) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " print: " + i);
        }
    }
}
