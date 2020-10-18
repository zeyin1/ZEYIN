package com.example.zeyin.algorithm;

/**
 * @Description: 给你一个字符串 s ，请你返回满足以下条件的最长子字符串的长度：每个元音字母，即 'a'，'e'，'i'，'o'，'u' ，在子字符串中都恰好出现了偶数次。
 * @Author: zeyin
 * @Date: 2020年10月18日 14:55
 * @Modify:
 */
public class leetcode1371_每个元音包含偶数次的最长子字符串 {
    /**
     * @Description: 如果i不是元音，那么dp[i][j]=dp[i-1][j]+1
     * 如果i是元音，那么找到它对应的位，假设是x，那么dp[i][j] = dp[i-1][j xor x]
     * @Author: zeyin
     * @Date: 2020/10/18 14:56
     */
    public int findTheLongestSubstring(String s) {
        char[] chars = new char[]{'a', 'e', 'i', 'o', 'u'};
        int[] nums = new int[]{16, 8, 4, 2, 1};
        int[][] dp = new int[s.length() + 1][32];

        //初始化值
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j < 32; j++) {
                dp[i][j] = -1;
            }
        }

        dp[0][0] = 0;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            //是否为元音
            boolean found = false;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == s.charAt(i)) {
                    //是元音
                    found = true;
                    for (int k = 0; k < 32; k++) {
                        if (dp[i][k] != -1) {
                            dp[i + 1][k ^ nums[j]] = dp[i][k] + 1;
                        }
                    }
                    dp[i + 1][0] = Math.max(0, dp[i + 1][0]);
                }
            }

            //不是元音
            if (!found) {
                dp[i + 1][0] = dp[i][0] + 1;
                for (int k = 1; k < 32; k++) {
                    if (dp[i][k] != -1) {
                        dp[i + 1][k] = dp[i][k] + 1;
                    }
                }
            }

            //更新结果
            res = Math.max(res, dp[i + 1][0]);
        }
        return res;
    }
}
