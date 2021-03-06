package com.example.zeyin.algorithm.leetCode;

public class leetcode201 {
    /**
     * @Description: 数字范围按位与
     * <p>
     * 给你两个整数 left 和 right ，表示区间 [left, right] ，
     * 返回此区间内所有数字 按位与 的结果（包含 left 、right 端点）。
     * <p>
     * 输入：left = 5, right = 7
     * 输出：4
     * @Author: zeyin
     * @Date: 2020年11月21日 11:41
     * @Modify:
     */
    public int rangeBitwiseAnd(int m, int n) {
        return 0;
    }


    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}
