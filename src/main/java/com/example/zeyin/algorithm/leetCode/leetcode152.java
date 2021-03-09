package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 乘积最大的子数组
 * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 * @Author: zeyin
 * @Date: 2020年11月22日 21:34
 * @Modify:
 */
public class leetcode152 {
    //动态规划
    //最大值、最小值、本身（元素的正负都有）

    /**
     * 动态规划
     * 最大值、最小值、本身（元素的正负都有）
     * 1、
     *
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        int maxF = nums[0];
        int minF = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int maxF1 = maxF;
            int minF1 = minF;
            maxF = Math.max(Math.max(maxF1 * nums[i], minF1 * nums[i]), nums[i]);
            minF = Math.min(Math.min(maxF1 * nums[i], minF1 * nums[i]), nums[i]);
            res = Math.max(res, maxF);
        }
        return res;

    }
}
