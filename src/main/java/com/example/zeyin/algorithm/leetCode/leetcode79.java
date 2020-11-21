package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 16:33
 * @Modify:
 */
public class leetcode79 {

    private String word;
    private char[][] board;
    private boolean[][] used;
    private int[][] direction = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};//方向
    private int m;
    private int n;

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length <= 0) {
            return false;
        }

        this.word = word;//类成员变量
        this.board = board;//类成员变量
        m = board.length;
        n = board[0].length;
        this.used = new boolean[m][n];//标记

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    //深度优先搜索(i，j,k)
    //（i，j）坐标值
    //k代表第几个单词
    private boolean dfs(int i, int j, int start) {
        //比较最后一个元素
        if (start == word.length() - 1) {
            return board[i][j] == word.charAt(start);
        }

        //符合要求
        if (board[i][j] == word.charAt(start)) {

            used[i][j] = true;//使用过
            //从4个方向遍历
            for (int k = 0; k < 4; k++) {

                int newX = i + direction[k][0];
                int newY = j + direction[k][1];

                //合法范围内
                if (0 <= newX && newX < m && 0 <= newY && newY < n && (!used[newX][newY])) {
                    if (dfs(newX, newY, start + 1)) {
                        return true;//只要有一个为真即可
                    }
                }
            }
            used[i][j] = false;//释放标记
        }
        return false;
    }
}
