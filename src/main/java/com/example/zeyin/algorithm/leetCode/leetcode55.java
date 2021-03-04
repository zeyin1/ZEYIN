package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 跳跃游戏
 *
 *给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 判断你是否能够到达最后一个下标。
 *
 * 输入：nums = [2,3,1,1,4]
 * 输出：true
 * 解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
 *
 * @Author: zeyin
 * @Date: 2020年11月21日 20:20
 * @Modify:
 */
public class leetcode55 {
    public boolean canJump(int[] nums) {

        //能达到的最远地方
        int reach = 0;

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i > reach) {
                return false;
            }
            reach = Math.max(i + nums[i], reach);
        }
        return true;
    }
}
