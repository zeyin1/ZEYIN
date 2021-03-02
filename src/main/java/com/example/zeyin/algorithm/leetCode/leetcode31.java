package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ExchangeUtil;

/**
 * @Description: 下一个排列
 * @Author: zeyin
 * @Date: 2020年11月21日 11:22
 * @Modify:
 */
public class leetcode31 {
    /**
     * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
     * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
     * 必须 原地 修改，只允许使用额外常数空间。
     * 思路：
     * （1）（从右到左）找到一个目标值，其高位大于目标值
     * （2）（从左到右）从目标值右侧开始，找到比目标值较小的元素（元素1）
     * （3）  交换目标值和元素1
     * （4） 把新的目标值右侧的数组反转
     *
     * 输入：nums = [1,2,3]
     * 输出：[1,3,2]
     *
     * @param nums
     */

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
