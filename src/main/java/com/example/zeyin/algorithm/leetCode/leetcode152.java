package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月22日 21:34
 * @Modify:
 */
public class leetcode152 {
    //动态规划
    //最大值、最小值、本身（元素的正负都有）
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
