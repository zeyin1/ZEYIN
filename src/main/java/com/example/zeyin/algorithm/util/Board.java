package com.example.zeyin.algorithm.util;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年08月09日 14:34
 * @Modify:
 */
public class Board {

    private boolean[][] marked;

    //        x-1,y
    // x,y-1  x,y    x,y+1
    //        x+1,y
    private int[][] direction = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    // 盘面上有多少行
    private int m;
    // 盘面上有多少列
    private int n;
    private String word;
    private char[][] board;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        if (m == 0) {
            return false;
        }
        n = board[0].length;
        marked = new boolean[m][n];
        this.word = word;
        this.board = board;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int start) {
        if (start == word.length() - 1) {
            return board[i][j] == word.charAt(start);
        }
        if (board[i][j] == word.charAt(start)) {
            marked[i][j] = true;
            for (int k = 0; k < 4; k++) {
                int newX = i + direction[k][0];
                int newY = j + direction[k][1];
                if (inArea(newX, newY) && !marked[newX][newY]) {
                    if (dfs(newX, newY, start + 1)) {
                        return true;
                    }
                }
            }
            marked[i][j] = false;
        }
        return false;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    /**
     * @Description: 用一句话描述
     * @Author: zeyin
     * @Date: 2020/8/10 21:48
     */
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0)
            return s;

        StringBuilder[] array = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            array[i] = new StringBuilder();
        }

        int dir = 1;
        int index = 0;
        for (char c : s.toCharArray()) {
            array[index].append(c);
            index += dir;
            if (index == 0 || index == array.length - 1) {
                dir = -dir;
            }
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : array) {
            res.append(sb);
        }
        return res.toString();
    }

    /**
     * @Description: 用一句话描述
     * @Author: zeyin
     * @Date: 2020/8/12 23:21
     */
    public double myPow(double x, int n) {
        if (n == 0 || x == 1)
            return 1;

        if (n < 0) {
            return 1 / myPow1(x, Math.abs(n));
        } else {
            return myPow1(x, Math.abs(n));
        }
    }

    public double myPow1(double x, int n) {
        if (n == 1) {
            return x;
        }

        if (n % 2 != 0) {
            double half = myPow(x, n / 2);
            return half * half * x;
        } else {
            double half = myPow(x, n / 2);
            return half * half;
        }
    }


}
