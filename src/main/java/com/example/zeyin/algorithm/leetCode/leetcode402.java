package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 17:04
 * @Modify:
 */
public class leetcode402 {

    //双指针
    //从左到右保证升序排列（可以相等）
    //从右到左，删除右边较大的数字
    public static String removeKdigits(String num, int k) {
        int r = 0, len = num.length();
        char[] res = new char[len];

        // 遍历，逐个入数组
        //删除左边大的数值，保证金左侧的数字升序排列
        for (char c : num.toCharArray()) {
            while (r > 0 && k > 0 && res[r - 1] > c) {
                k--;
                r--;
            }
            res[r++] = c;
        }

        // k 还有余，后面大的删起（从右边删除大的）
        while (k-- > 0 && r > 0) r--;

        // 移除头部零
        int l = 0; // 此时才需要 left 指针
        while (l < r && res[l] == '0') l++;
        if (l == r) return "0";

        // 构建，返回
        return new String(res, l, r - l);
    }
}
