package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 16:14
 * @Modify:
 */
public class leetcode678 {
    //双向遍历
    public boolean checkValidString(String s) {

        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ')')
                l++;//(统计
            else if (l-- == 0) //）统计
                return false;
        }

        if (l == 0)
            return true;

        int r = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '(') r++;
            else if (r-- == 0)
                return false;
        }
        return true;
    }
}
