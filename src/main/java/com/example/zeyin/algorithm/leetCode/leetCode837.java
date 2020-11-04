package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月04日 19:51
 * @Modify:
 */
public class leetCode837 {

    public double new21Game(int N, int k, int W) {
        if (k == 0) {
            return 1.0;
        }

        double[] dp = new double[k + W];
        for (int i = k; i <= N && i < (k + W); i++) {
            dp[i] = 1.0;
        }

        dp[k - 1] = 1.0 * Math.min(N - k + 1, W) / W;

        for (int i = k - 2; i >= 0; i--) {
            dp[i] = dp[i + 1] - (dp[i + W + 1] - dp[i + 1]) / W;
        }

        return dp[0];

    }
}
