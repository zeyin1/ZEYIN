package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 14:03
 * @Modify:
 */
public class leetcode54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length <= 0) {
            return res;
        }

        //遍历
        int up = 0, down = matrix.length;
        int left = 0, right = matrix[0].length;
        while (up <= down && left <= right) {
            //横向
            for (int i = left; i <= right; i++) {
                res.add(matrix[up][i]);
            }
            up++;

            //竖向
            for (int i = up; i <= down; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            //负横向
            for (int i = right; i >= left; i--) {
                res.add(matrix[down][i]);
            }
            down--;

            //负竖向
            for (int i = down; i >= up; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }

        return res;
    }
}
