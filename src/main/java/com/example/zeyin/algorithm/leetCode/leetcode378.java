package com.example.zeyin.algorithm.leetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年12月05日 21:23
 * @Modify:
 */
public class leetcode378 {
    //
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0] - t1[0];
            }
        });

        for (int i = 0; i < matrix.length; i++) {
            pq.offer(new int[]{matrix[i][0], i, 0});
        }

        for (int i = 0; i < k - 1; i++) {
            int[] nums = pq.poll();
            if (nums[2] != matrix.length - 1) {
                pq.offer(new int[]{matrix[nums[1]][nums[2] + 1], nums[1], nums[2] + 1});
            }
        }

        return pq.poll()[0];
    }
}
