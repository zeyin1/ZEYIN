package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 20:20
 * @Modify:
 */
public class leetcode55 {
    public boolean canJump(int[] nums) {
        int reach = 0;//能达到的最远地方
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i > reach) {
                return false;
            }
            reach =Math.max(i + nums[i], reach);
        }
        return true;
    }
}
