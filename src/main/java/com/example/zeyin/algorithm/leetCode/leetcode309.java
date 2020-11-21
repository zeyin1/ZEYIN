package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 19:06
 * @Modify:
 */
public class leetcode309 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int len = prices.length;
        int[] sell = new int[len];
        int[] buy = new int[len];

        sell[0] = 0;
        buy[0] = -prices[0];

        for (int i = 1; i < len; i++) {
            //（1）昨天卖（今天不卖）
            //（2）今天卖（昨天买）
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
            if (i >= 2) {
                //3天及以上可能存在冻结期
                //(1)昨天买出，今天与昨天一样（今天不买）
                //（2）前天卖，昨天冻结，今天买出
                buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);
            } else {
                //没有冻结期，因为还没有操作（2天）
                //（1）昨天买（今天不买）
                //（2）今天买
                buy[i] = Math.max(buy[i - 1], -prices[i]);
            }
        }
        return sell[len - 1];
    }
}
