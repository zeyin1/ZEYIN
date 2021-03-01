package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 16:31
 * @Modify:
 */
public class leetcode10_03 {
    public int search(int[] arr, int target) {
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l >> 1);

            //大于等于目标值，往左边靠
            if (arr[mid] >= target) {
                if (arr[h] < arr[mid] && arr[h] >= target) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            } else {
                if (arr[mid] < arr[l] && target >= arr[l]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        if (l < arr.length && arr[l] == target) return l;
        return -1;
    }
}
