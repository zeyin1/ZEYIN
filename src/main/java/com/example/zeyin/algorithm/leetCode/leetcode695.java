package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 18:39
 * @Modify:
 */
public class leetcode695 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int val = dfs(grid, i, j);
                    max = Math.max(max, val);
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (0 <= i && i < grid.length && 0 <= j && j < grid[0].length && grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1 + dfs(grid, i - 1, j) + dfs(grid, i, j - 1) + dfs(grid, i + 1, j) + dfs(grid, i, j + 1);
        } else {
            return 0;
        }
    }
}
