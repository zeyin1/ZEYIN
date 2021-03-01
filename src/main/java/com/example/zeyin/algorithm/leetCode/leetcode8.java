package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 17:38
 * @Modify:
 */
public class leetcode8 {
    public int myAtoi(String str) {
        if (str.length() == 0) {
            return 0;    //判断是否为空字符串
        }

        int i = 0;    //字符串索引
        int flag = 1;//正负判断
        int base = 0;//存储转换后数字

        //去除空格
        while (str.charAt(i) == ' ') {
            i++;
            if (i == str.length()) //如果全为空格则直接返回，如果不加这个if会导致全为空格时的out of range的错误
                return 0;
        }

        //第一个字符为正负号时
        if (str.charAt(i) == '-' || str.charAt(i) == '+') {
            flag = str.charAt(i++) == '-' ? -1 : 1;
        }

        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            //str.charAt(i)-'0'>7，会溢出
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (flag == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = (str.charAt(i++) - '0') + base * 10;
        }
        return base * flag;
    }
}
