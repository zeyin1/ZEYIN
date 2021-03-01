package com.example.zeyin.algorithm.sortAlg;

/**
 * @Description: 插入排序
 * @Author: zeyin
 * @Date: 2020年11月19日 16:27
 * @Modify:
 */
public class InsertSort {
    /**
     * 一个元素与之前的元素对比，找到自己的位置，插入进去
     *
     * @param nums
     */
    public static void insertSort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int insertnum = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > insertnum) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = insertnum;
        }
    }
}
