package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
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
