package com.example.zeyin.problem;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月23日 13:41
 * @Modify:
 */
public class ProOfVolatile01 {
    volatile int i;

    public void addI(){
        i++;
    }

    public static void main(String[] args) throws InterruptedException {
        final  ProOfVolatile01 proOfVolatile01 = new ProOfVolatile01();
        for (int n = 0; n < 1000; n++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    proOfVolatile01.addI();
                }
            }).start();
        }

        Thread.sleep(10000);//等待10秒，保证上面程序执行完成

        System.out.println(proOfVolatile01.i);
    }
}
