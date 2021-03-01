package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ExchangeUtil;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 11:22
 * @Modify:
 */
public class leetcode31 {

    public static void nextPermutation(int[] nums) {

        int i = nums.length - 2;

        //找到目标值，其后一个元素大于目标值
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }

        if (i >= 0) {

            //找到一个元素比目标值稍微大的
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            //交换j,i元素
            ExchangeUtil.exchange(i, j, nums);
        }

        //反转I=1后面数组
        reverse(nums, i + 1);

    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            ExchangeUtil.exchange(i, j, nums);
            i++;
            j--;
        }
    }
}
