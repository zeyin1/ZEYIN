package com.example.zeyin.设计模式.单例模式;

/**
 * @Description: 单例模式-懒汉模式(线程安全)
 * @Author: zeyin
 * @Date: 2020年03月29日 15:54:19
 * @Modify:
 */

public class SingletonDemo01 {

    //没有初始化该对象，当实际用到时再创建
    private static SingletonDemo01 singletonDemo01;

    //构造器私有化
    private SingletonDemo01() {
    }

    //方法同步，线程安全；如果没有synchronized，则是线程不安全的懒汉模式
    public static synchronized SingletonDemo01 getSingletonDemo01() {
        if (singletonDemo01 == null) {
            singletonDemo01 = new SingletonDemo01();
        }
        return singletonDemo01;
    }
}
