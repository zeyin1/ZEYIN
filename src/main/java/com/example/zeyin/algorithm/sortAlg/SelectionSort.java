package com.example.zeyin.algorithm.sortAlg;

/**
 * @Description: 选择排序
 * @Author: zeyin
 * @Date: 2020年11月19日 16:27
 * @Modify:
 */
public class SelectionSort {
    /**
     * 一个元素与之前的元素对比，然后交换位置
     * @param nums
     */

    public static void selectionSort(int[] nums){
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[j] < nums[i]) {
                    SortUtil.exchange(i, j, nums);
                }
            }
        }
    }
}
