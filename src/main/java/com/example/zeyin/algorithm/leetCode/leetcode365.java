package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月24日 21:07
 * @Modify:
 */
public class leetcode365 {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x == z || y == z || x + y <= z) {
            if (x + y < z) {
                return false;
            }
            return true;
        }
        return x > y ? (z % gcd(x, y)) == 0 : (z % gcd(y, x)) == 0;
    }

    public int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
