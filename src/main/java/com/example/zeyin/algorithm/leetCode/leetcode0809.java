package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年02月25日 14:35
 * @Modify:
 */
public class leetcode0809 {

    /**
     * dfs+回溯
     *
     * @param n
     * @return
     */
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n > 0) {
            dfs(0, 0, n, new StringBuilder(), result);
        }
        return result;
    }

    private static void dfs(int l, int r, int n, StringBuilder str, List<String> result) {

        if (str.length() == (2 * n)) {
            result.add(str.toString());
            return;
        }

        if (l < n) {
            str.append("(");
            dfs(l + 1, r, n, str, result);
            //截取长度的字符串(回溯)
            str.setLength(str.length() - 1);
        }

        if (r < l) {
            str.append(")");
            dfs(l, r + 1, n, str, result);
            //截取长度的字符串(回溯)
            str.setLength(str.length() - 1);
        }
    }
}
