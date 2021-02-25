package com.example.zeyin.algorithm.leetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年02月25日 15:17
 * @Modify:
 */
public class leetcode1714 {
    /**
     * 最小优先队列
     * @param arr
     * @param k
     * @return
     */
    public int[] smallestK(int[] arr, int k) {
        int[] vec = new int[k];
        if (k == 0) { // 排除 0 的情况
            return vec;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        });
        for (int i = 0; i < k; ++i) {
            queue.offer(arr[i]);
        }
        for (int i = k; i < arr.length; ++i) {
            if (queue.peek() > arr[i]) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        for (int i = 0; i < k; ++i) {
            vec[i] = queue.poll();
        }
        return vec;
    }
}
