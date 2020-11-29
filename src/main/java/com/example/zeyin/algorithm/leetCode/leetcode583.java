package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 17:31
 * @Modify:
 */
public class leetcode583 {

    //动态规划

    public int minDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 || j == 0)
                    //边界值（i+j）
                    //认为完全不同（i个不同值，或j个不同值）
                    dp[i][j] = i + j;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    //数字相同
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    //数字不同
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
