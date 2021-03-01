package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月20日 16:59
 * @Modify:
 */
public class 平衡点 {

    public static List<Integer> Method(int[] nums) {
        List<Integer> resList = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return resList;
        }

        int len = nums.length;
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];

        leftSum[0] = nums[0];
        for (int i = 1; i < len; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i];
        }

        rightSum[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i];
        }

        for (int i = 1; i < len - 1; i++) {
            if (leftSum[i] == rightSum[i]) {
                resList.add(nums[i]);
            }
        }

        return resList;

    }
}
