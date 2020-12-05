package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年12月05日 20:58
 * @Modify:
 */
public class leetcode0811 {
    //动态规划
    public int waysToChange(int n) {
        int[][] dp = new int[4][n + 1];
        int[] coins = {1, 5, 10, 15};

        for (int i = 0; i <= n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < 4; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= coins[i]) {
                    //减去硬币数值的组合数+前一个属猪的个数
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - coins[i]]) % 1000000007;
                } else {
                    //与前一个保持一致
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[3][n];
    }

    //方法2
    public static int waysToChange1(int n) {
        //dp[i]代表i元钱的组合数
        int[] dp = new int[n + 1];
        int[] coins = {1, 5, 10, 25};

        //0值有1种
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = 1; j <= n; j++) {
                if (j >= coin) {
                    dp[j] = (dp[j] + dp[j - coin]) % 1000000007;
                }
            }
        }
        return dp[n];
    }
}
