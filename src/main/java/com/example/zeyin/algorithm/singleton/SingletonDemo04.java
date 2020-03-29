package com.example.zeyin.algorithm.singleton;

/**
 * @Description: 单例模式-静态内部类
 * @Author: zeyin
 * @Date: 2020年03月29日 15:54:19
 * @Modify:
 */

public class SingletonDemo04 {

    //静态内部类
    private static class singletonDemoInner04{
        private static final SingletonDemo04 singletonDemo04=new SingletonDemo04();
    }

    //构造器私有化
    private SingletonDemo04(){}

    public static SingletonDemo04 getSingletonDemo03(){
        return singletonDemoInner04.singletonDemo04;
    }
}
