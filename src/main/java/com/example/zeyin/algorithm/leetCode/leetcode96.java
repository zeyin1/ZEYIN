package com.example.zeyin.algorithm.leetCode;

/**
 * @Description:  不同的二叉搜索树
 *
 * 给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
 *
 * @Author: zeyin
 * @Date: 2020年11月21日 20:05
 * @Modify:
 */
public class leetcode96 {
    //todo ...
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
