package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 20:40
 * @Modify:
 */
public class leetcode91 {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int len = s.length();
        int[] dp = new int[len + 1];//解码方式数
        dp[0] = 1;
        dp[1] = (s.charAt(0) == '0') ? 0 : 1;

        for (int i = 1; i < len; i++) {
            char c = s.charAt(i);
            char pre = s.charAt(i - 1);

            dp[i + 1] = (c == '0') ? 0 : dp[i];//单独成为一个字母
            if (pre == '1' || (pre == '2' && c <= '6')) {
                dp[i + 1] = dp[i + 1] + dp[i - 1];//加上i-1前的统计
            }
        }
        return dp[len];
    }
}
