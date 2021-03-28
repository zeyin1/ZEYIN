package com.example.zeyin.algorithm.leetCode;

import java.util.PriorityQueue;

/**
 * @Description: 数组中的第K个最大元素
 *
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * @Author: zeyin
 * @Date: 2020年11月21日 11:09
 * @Modify:
 */
public class leetcode215 {

    public static int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return Integer.MAX_VALUE;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > queue.peek()) {
                queue.poll();
                queue.add(nums[i]);
            }
        }

        return queue.poll();//第K大元素

    }
}
