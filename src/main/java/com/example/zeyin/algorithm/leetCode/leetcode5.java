package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 最长回文
 * @Author: zeyin
 * @Date: 2020年11月20日 21:20
 * @Modify:
 */
public class leetcode5 {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() <= 0) {
            return "";
        }

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = findCentrol(i, i, s);
            int len2 = findCentrol(i, i + 1, s);

            int res = Math.max(len1, len2);
            if (res > end - start) {
                start = i - (res - 1) / 2;
                end = i + res / 2;
            }
        }
        return s.substring(start, end + 1);

    }

    //中心法则
    private static int findCentrol(int left, int right, String s) {
        int l = left;
        int r = right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;//布符合条件时增加了2
    }
}
