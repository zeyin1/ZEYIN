package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 15:00
 * @Modify:
 */
public class leetcode1262 {

    //动态规划
    public static int maxSumDivThree(int[] nums) {
        int[] dp = new int[]{0, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int num : nums) {
            int[] dp2 = new int[3];

            //余数（0，1，2）
            for (int i = 0; i < 3; i++) {
                dp2[(i + num) % 3] = Math.max(dp[(i + num) % 3], dp[i] + num);
            }

            dp = dp2;
        }
        return dp[0];
    }
}
