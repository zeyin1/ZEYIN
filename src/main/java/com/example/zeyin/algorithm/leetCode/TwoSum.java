package com.example.zeyin.algorithm.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年09月21日 21:24
 * @Modify:
 */
public class TwoSum {

    /**
     * @Description: 1、两数之和
     * @Author: zeyin
     * @Date: 2020/9/21 21:34
     */
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                return new int[]{numMap.get(target - nums[i]), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[2];
    }
}
