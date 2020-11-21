package com.example.zeyin.algorithm.leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 18:51
 * @Modify:
 */
public class leetcode347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }

        //最大堆(map的val越大，key在队列前面)
        PriorityQueue queue = new PriorityQueue<Integer>((n1, n2) -> map.get(n2) - map.get(n1));
        for (int num : map.keySet()) {
            queue.add(num);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = (int) queue.poll();
        }
        return res;
    }
}
