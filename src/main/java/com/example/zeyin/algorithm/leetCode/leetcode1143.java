package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月24日 14:24
 * @Modify:
 */
public class leetcode1143 {
    public static int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text2 == null) {
            return 0;
        }

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int row = 0; row < dp.length; row++) {
            dp[row][0] = 0;
        }
        for (int col = 0; col < dp[0].length; col++) {
            dp[0][col] = 0;
        }

        for (int i = 1; i < dp.length; i++) {
            char num1 = text1.charAt(i - 1);
            for (int j = 1; j < dp[0].length; j++) {
                char num2 = text2.charAt(j - 1);
                if (num1 == num2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[text1.length()][text2.length()];
    }
}
