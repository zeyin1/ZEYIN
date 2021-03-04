package com.example.zeyin.algorithm.leetCode;

/**
 * @Description:  不同路径
 *
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 *
 * 问总共有多少条不同的路径？
 *
 *  输入：m = 3, n = 7
 *  输出：28
 *
 * @Author: zeyin
 * @Date: 2020年11月24日 20:25
 * @Modify:
 */
public class leetcode62 {
    //todo .....

    public int uniquePaths(int m, int n) {
        int[][] nums = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    nums[i][j] = 1;
                } else {
                    nums[i][j] = nums[i - 1][j] + nums[i][j - 1];
                }
            }
        }
        return nums[m - 1][n - 1];
    }
}
