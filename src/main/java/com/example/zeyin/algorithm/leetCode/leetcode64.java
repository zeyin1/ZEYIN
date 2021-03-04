package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 最小路径和
 *
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 *
 * 方法：动态规划
 * dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
 * @Author: zeyin
 * @Date: 2020年11月21日 17:44
 * @Modify:
 */
public class leetcode64 {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];

        //(0,0)位置
        dp[0][0] = grid[0][0];

        //（X，0）位置
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        //（0，Y）位置
        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }


        //（X，Y）位置
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        return dp[rows - 1][cols - 1];
    }
}
