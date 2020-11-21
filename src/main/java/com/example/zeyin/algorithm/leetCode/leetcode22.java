package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 13:43
 * @Modify:
 */
public class leetcode22 {
    private List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generating(n, n, "");
        return res;
    }

    private void generating(int left, int right, String str) {
        //满足条件
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }

        //增加一个左括号
        if (left > 0) {
            generating(left - 1, right, str + "(");
        }

        //增加一个右括号
        if (left < right) {
            generating(left, right - 1, str + ")");
        }
    }
}
