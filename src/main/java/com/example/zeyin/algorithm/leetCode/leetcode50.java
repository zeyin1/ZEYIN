package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。
 *
 * 二分查找进行计算
 *
 * @Author: zeyin
 * @Date: 2020年11月22日 21:52
 * @Modify:
 */
public class leetcode50 {

    public double myPow(double x, int n) {
        //n为负数和正数情况
        return n < 0 ? 1 / power(x, -n) : power(x, n);
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
