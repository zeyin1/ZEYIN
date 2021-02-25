package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年02月25日 14:52
 * @Modify:
 */
public class leetcode0107 {
    /**
     * 顺时针旋转90度
     * 1、水平翻转
     * 2、主对角线翻转
     * <p>
     * 拓展
     * 逆时针旋转90度
     * 1、垂直翻转
     * 2、主对角线翻转
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - 1 - i][j];
                matrix[len - 1 - i][j] = temp;
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

}
