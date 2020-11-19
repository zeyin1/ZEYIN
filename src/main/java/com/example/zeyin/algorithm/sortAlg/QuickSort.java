package com.example.zeyin.algorithm.sortAlg;

/**
 * @Description: 快速排序
 * @Author: zeyin
 * @Date: 2020年11月19日 15:51
 * @Modify:
 */
public class QuickSort {

    public static void quickSort(int l, int r, int[] nums) {
        if (l > r) {
            return;
        }

        int i = l;//左索引
        int j = r;//右索引
        int target = nums[l];//目标值

        while (i < j) {
            //找到较小值
            while ((i < j) && (nums[j] >= target)) {
                j--;
            }

            //找到较大值
            while ((i < j) && (nums[i] <= target)) {
                i++;
            }

            if (i < j) {
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
            }
        }

        //交换目标值
        nums[l] = nums[i];
        nums[i] = target;

        //递归处理
        quickSort(l, i - 1, nums);
        quickSort(i + 1, r, nums);
    }
}
