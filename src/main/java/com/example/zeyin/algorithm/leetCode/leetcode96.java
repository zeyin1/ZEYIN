package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 20:05
 * @Modify:
 */
public class leetcode96 {
    public int numTrees(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                //i-1-j,j的数字组合
                nums[i] = nums[i] + nums[j] * nums[i - 1 - j];
            }
        }
        return nums[n];
    }
}
