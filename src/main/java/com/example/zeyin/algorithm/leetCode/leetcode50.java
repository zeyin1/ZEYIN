package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月22日 21:52
 * @Modify:
 */
public class leetcode50 {

    public double myPow(double x, int n) {
        //n正负
        if (n < 0)
            return 1 / power(x, -n);
        else
            return power(x, n);
    }

    public double power(double x, int n) {
        if (n == 0)
            return 1;
        //二分查找
        double v = power(x, n / 2);

        if (n % 2 == 0)
            //偶数
            return v * v;
        else
            //奇数
            return v * v * x;
    }
}
