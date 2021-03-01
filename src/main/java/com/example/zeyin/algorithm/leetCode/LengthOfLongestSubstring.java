package com.example.zeyin.algorithm.leetCode;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年09月21日 21:35
 * @Modify:
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();

        int res = 0;
        for (int end = 0; start < s.length() && end < s.length(); end++) {

            if (map.containsKey(s.charAt(end))) {
                start = Math.max(map.get(s.charAt(end)), start);
            }
            map.put(s.charAt(end), end + 1);
            res = Math.max(res, end - start + 1);
        }
        return res;
    }
}
