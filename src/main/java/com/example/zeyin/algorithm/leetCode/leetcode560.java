package com.example.zeyin.algorithm.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月22日 21:55
 * @Modify:
 */
public class leetcode560 {

    //动态规划

    /**
     * pre[i]代表i之前（包括i）的和
     * 0<j<i
     * pre[i]-pre[j]=k
     */
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int pre = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            pre = pre + nums[i];

            if (map.containsKey(pre - k)) {
                count += map.get(pre - k);
            }

            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;

    }
}
