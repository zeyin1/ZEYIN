package com.example.zeyin.algorithm.leetCode;

/**
 * @Description:  长度最小的子数组
 *
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 
 * [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 *
 * @Author: zeyin
 * @Date: 2020年11月23日 23:04
 * @Modify:
 */
public class leetcode209 {

    public int minSubArrayLen(int s, int[] nums) {
        int left = 0, right = -1;//right=0就包含了第一个元素
        int sum = 0;
        int res = nums.length + 1;

        while (left < nums.length) {
            if (right + 1 < nums.length && sum < s)
                sum += nums[++right];//right向右移动
            else
                sum -= nums[left++];

            if (sum >= s)
                res = Math.min(res, right - left + 1);
        }
        if (res == nums.length + 1)
            return 0;
        return res;
    }
}
