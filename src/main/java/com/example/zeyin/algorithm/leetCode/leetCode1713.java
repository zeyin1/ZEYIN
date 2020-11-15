package com.example.zeyin.algorithm.leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月15日 15:31
 * @Modify:
 */
public class leetCode1713 {
    public int respace(String[] dictionary, String sentence) {
        Set<String> dict = new HashSet<>(Arrays.asList(dictionary));
        int n = sentence.length();
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int idx = 0; idx < i; idx++) {
                if (dict.contains(sentence.substring(idx, i))) {
                    dp[i] = Math.min(dp[i], dp[idx]);
                }
            }
        }
        return dp[n];
    }
}
