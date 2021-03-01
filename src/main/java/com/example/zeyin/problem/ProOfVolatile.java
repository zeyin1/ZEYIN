package com.example.zeyin.problem;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月23日 13:41
 * @Modify:
 */
public class ProOfVolatile {
    int a = 1;
    int b = 2;

    public void change() {
        a = 3;
        b = a;
    }

    public void print() {
        System.out.println("b值为：" + b + ",  a值为：" + a);
    }

    public static void method() {
        while (true) {
            final ProOfVolatile proOfVolatile = new ProOfVolatile();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    proOfVolatile.change();
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    proOfVolatile.print();
                }
            }).start();

        }
    }

    public static void main(String[] args) {
        method();
    }
}
