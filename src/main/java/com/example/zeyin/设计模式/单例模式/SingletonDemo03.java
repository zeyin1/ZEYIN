package com.example.zeyin.设计模式.单例模式;

/**
 * @Description: 单例模式-双重检测机制（缺点：JVM底层实现模型原因，可能会出现问题，不建议使用）
 * @Author: zeyin
 * @Date: 2020年03月29日 15:54:19
 * @Modify:
 */

public class SingletonDemo03 {

    //编译时初始化对象，所有线程安全
    private static SingletonDemo03 singletonDemo03;

    //构造器私有化
    private SingletonDemo03(){}

    //方法同步，使用synchronized模块
    public static SingletonDemo03 getSingletonDemo03(){
        if(singletonDemo03==null){
            //锁住该对象
            synchronized (SingletonDemo01.class){
                if(singletonDemo03==null){
                    singletonDemo03=new SingletonDemo03();
                }
            }
        }
        return singletonDemo03;
    }
}
