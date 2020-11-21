package com.example.zeyin.algorithm.leetCode;

import java.util.Arrays;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 15:09
 * @Modify:
 */
public class leetcode322 {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[max];

        Arrays.fill(dp, max);//数组的所有元素为max（硬币最多的情况）

        for (int i = 1; i <= amount; i++) {//i元钱
            for (int j = 0; j < coins.length; j++) {//币种
                //可以兑换条件
                if (coins[j] <= i) {
                    //最少硬币最少的个数
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
