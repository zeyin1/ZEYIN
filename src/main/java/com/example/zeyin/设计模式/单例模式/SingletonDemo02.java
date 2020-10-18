package com.example.zeyin.设计模式.单例模式;

/**
 * @Description: 单例模式-饿汉模式(线程安全)
 * @Author: zeyin
 * @Date: 2020年03月29日 15:54:19
 * @Modify:
 */

public class SingletonDemo02 {

    //编译时初始化对象，所有线程安全
    private static SingletonDemo02 singletonDemo02=new SingletonDemo02();

    //构造器私有化
    private SingletonDemo02(){}

    //方法同步，线程安全
    public static SingletonDemo02 getSingletonDemo02(){
        return singletonDemo02;
    }
}
