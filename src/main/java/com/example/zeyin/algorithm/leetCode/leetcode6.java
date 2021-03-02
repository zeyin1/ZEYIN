package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: Z字形变换
 * @Author: zeyin
 * @Date: 2020年11月21日 19:27
 * @Modify:
 */
public class leetcode6 {
    public static String convert(String s, int numRows) {
        if (s == null || s.length() == 0) {
            return s;
        }

        StringBuilder[] array = new StringBuilder[numRows];//每个元素是一行的字符串
        for (int i = 0; i < numRows; i++) {
            array[i] = new StringBuilder();
        }

        int index = 0;
        int dir = 1;
        for (char c : s.toCharArray()) {
            array[index].append(c);

            //排除一行的情况
            if (numRows > 1) {
                index = index + dir;
                if (index == 0 || index == numRows - 1) {
                    dir = -dir;
                }
            }
        }

        //组合成结果
        StringBuilder res = new StringBuilder();
        for (StringBuilder num : array) {
            res.append(num);
        }
        return res.toString();
    }
}
