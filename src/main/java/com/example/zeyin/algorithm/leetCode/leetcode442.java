package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 17:22
 * @Modify:
 */
public class leetcode442 {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;

            //结果集
            if (nums[index] < 0) {
                res.add(Math.abs(index + 1));
            }
            //把对应位置的数值取反
            nums[index] = -nums[index];
        }
        return res;
    }
}
