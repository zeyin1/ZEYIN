package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 最长递增子序列
 *
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 *
 * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。
 * 例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 *
 * @Author: zeyin
 * @Date: 2020年11月21日 15:50
 * @Modify:
 */
public class leetcode300 {

    //res[i]，表示i元素之前的最长上升子序列
    public int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            //元素本身
            res[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    //本身，或者是res[j]+1长度，1代表i的元素（这样的作法不是连续）
                    res[i] = Math.max(res[i], res[j] + 1);
                }
            }
            //标记结果集
            max = Math.max(max, res[i]);
        }
        return max;
    }
}
