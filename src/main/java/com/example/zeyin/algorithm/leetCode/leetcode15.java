package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 三数之和
 * @Author: zeyin
 * @Date: 2020年11月20日 21:40
 * @Modify:
 */
public class leetcode15 {
    /**
     * 1、去重数值（首先第一个数去重，接着后两个数去重）
     * 2、后两个数之和等于第一个数的相反数
     *
     * @param nums
     * @return
     */

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            //去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;
            int sum = -nums[i];
            while (l < r) {
                if (nums[l] + nums[r] == sum) {
                    resList.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    //去重
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (r > l && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    //下一个元素
                    l++;
                    r--;
                } else if (nums[l] + nums[r] < sum) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return resList;
    }
}
