package com.example.zeyin.algorithm.leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月13日 19:46
 * @Modify:
 */
public class leetcode409 {
    public int longestPalindrome(String s) {
        Set<Character> hs = new HashSet<Character>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(i));
                count++;
            } else {
                hs.add(s.charAt(i));
            }
        }
        if (!hs.isEmpty()) {
            return count * 2 + 1;
        } else {
            return count * 2;
        }
    }
}
