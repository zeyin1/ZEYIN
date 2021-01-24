package com.example.zeyin.algorithm.leetCode;

import java.util.LinkedList;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月24日 15:23
 * @Modify:
 */
public class leetcode316 {

    public static String removeDuplicateLetters(String s) {
        LinkedList<Character> deque = new LinkedList<>();
        int[] count = new int[26];
        boolean[]exists = new boolean[26];
        // 初始化
        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }
        // 遍历s并入栈
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (!exists[temp - 'a']){
                while (!deque.isEmpty() && deque.getLast() > temp && count[deque.getLast() - 'a'] > 0){
                    exists[deque.getLast() - 'a'] = false;
                    deque.removeLast();
                }
                deque.add(temp);
                exists[temp - 'a'] = true;
            }
            count[temp - 'a']--;
        }
        //返回
        StringBuilder res = new StringBuilder();
        for(char ch : deque){
            res.append(ch);
        }
        return res.toString();
    }
}
