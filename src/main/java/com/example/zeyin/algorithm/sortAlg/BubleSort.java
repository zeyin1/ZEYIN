package com.example.zeyin.algorithm.sortAlg;

import com.example.zeyin.util.ExchangeUtil;

/**
 * @Description: 冒泡排序
 * @Author: zeyin
 * @Date: 2020年11月19日 16:26
 * @Modify:
 */
public class BubleSort {
    /**
     * 一个元素与之后的元素对比，然后交换位置
     *
     * @param nums
     */

    public static void bubleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    ExchangeUtil.exchange(j, j + 1, nums);
                }
            }
        }
    }


}
