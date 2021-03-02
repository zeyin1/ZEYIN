package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 括号生成
 * @Author: zeyin
 * @Date: 2020年11月21日 13:43
 * @Modify:
 */
public class leetcode22 {
    /**
     * 迭代方法、双指针
     */
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n > 0) {
            generating(n, n, "", res);
        }
        return res;
    }

    private static void generating(int left, int right, String str, List<String> res) {
        //满足条件
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }

        //增加一个左括号
        if (left > 0) {
            generating(left - 1, right, str + "(", res);
        }

        //增加一个右括号
        if (left < right) {
            generating(left, right - 1, str + ")", res);
        }
    }
}
