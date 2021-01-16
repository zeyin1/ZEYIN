package com.example.zeyin.problem;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月16日 10:12
 * @Modify:
 */
public class ProOfClassLoader {

    public static void method1() throws ClassNotFoundException {
        //加载类
        ProOfClassLoader.class.getClassLoader().loadClass("com.example.zeyin.problem.ProOfBigDecimal");
    }
}
