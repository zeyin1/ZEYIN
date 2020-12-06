package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年12月06日 17:04
 * @Modify:
 */
public class leetcode912排序数组 {

    //todo..
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    private void sort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int j = quickSort(nums, l, r);
        sort(nums, l, j - 1);
        sort(nums, j + 1, r);
    }

    private int quickSort(int[] nums, int l, int r) {
        int base = nums[l];
        int i = l;
        int j = r + 1;
        while (true) {
            while (less(base, nums[--j]) && j != l) ;
            while (less(nums[++i], base) && i != r) ;
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        return j;
    }

    private boolean less(int a, int b) {
        return a <= b;
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
