package com.example.zeyin.algorithm.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 16:25
 * @Modify:
 */
public class leetcode395 {

    /**
     * 分割字符串，不满足条件的字符用“，”代替，分割成多个字符串
     */

    public int longestSubstring(String s, int k) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char chs : s.toCharArray()) {
            map.put(chs, map.getOrDefault(chs, 0) + 1);
        }

        // 这里是先把 s 传进 sb 中来找出不满足 k 个的元素及其位置
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) < k) {
                sb.setCharAt(i, ',');
            }
        }

        // 然后以不符合要求的元素位置进行分割存储到字符串数组中
        String[] string = sb.toString().split(",");
        // 如果仅有一组，则说明只有一个字母，返回首字母既可
        if (string.length == 1) {
            return string[0].length();
        }
        int max = 0;
        // 如果有多组，就进行最大值比较
        // 例如 aaabcccc，通过上面的操作后 化为 aaa,cccc
        for (String str : string) {
            max = Math.max(max, longestSubstring(str, k));
        }
        return max;
    }
}
