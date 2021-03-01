package com.example.zeyin.algorithm.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 无重复字符得最长子串得长度
 * @Author: zeyin
 * @Date: 2020年11月20日 18:18
 * @Modify:
 */
public class leetcode3 {
    /**
     * 双指针方法
     */

    public static int method(String s) {
        int res = 0;
        if (s.isEmpty()) {
            return res;
        }

        Map<Character, Integer> map = new HashMap<>();//元素，最新得位置
        int start = 0;
        int end = 0;
        while (start < s.length() && end < s.length()) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(start, map.get(s.charAt(end)));//更新开始位置
            }
            map.put(s.charAt(end), end + 1);//位置=索引+1
            res = Math.max(res, end - start + 1);
            end++;
        }
        return res;
    }
}
