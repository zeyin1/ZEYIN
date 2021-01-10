package com.example.zeyin.Exception;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月10日 14:13
 * @Modify:
 */
public class ExceptionForLearn {

    /**
     * @Description: 数组越界是运行时异常
     * @Author: zeyin
     * @Date: 2021/1/10 14:16
     */
    public static void ArrayException(){
        int[] arrays=new int[10];
        System.out.print(arrays[10]);
    }
}
