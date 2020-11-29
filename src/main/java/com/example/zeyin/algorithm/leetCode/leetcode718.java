package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 17:13
 * @Modify:
 */
public class leetcode718 {
    /**
     * 方法一：动态规划
     * 方法二：滑窗
     *
     * @param A
     * @param B
     * @return
     */

    //动态规划
    public static int findLength(int[] A, int[] B) {
        int max = 0;
        int[] dp = new int[B.length + 1];//B数组长度+1

        for (int i = 1; i <= A.length; i++) {
            for (int j = B.length; j >= 1; j--) {
                if (A[i - 1] == B[j - 1]) {
                    //相等时，长度加1
                    dp[j] = dp[j - 1] + 1;
                } else {
                    //不等时，重新设置值
                    dp[j] = 0;
                }
                max = Math.max(max, dp[j]);
            }
        }
        return max;
    }
}
