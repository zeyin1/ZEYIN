package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 15:50
 * @Modify:
 */
public class leetcode300 {

    //res[i]，表示i元素之前的最长上升子序列
    public int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            res[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    res[i] = Math.max(res[i], res[j] + 1);//可以不连续
                }
            }
            max = Math.max(max, res[i]);
        }
        return max;
    }
}
