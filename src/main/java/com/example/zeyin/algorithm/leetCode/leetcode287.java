package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 20:28
 * @Modify:
 */
public class leetcode287 {
    public int findDuplicate(int[] nums) {
        int low = 1, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count <= mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
