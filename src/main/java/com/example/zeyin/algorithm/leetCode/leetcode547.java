package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年02月23日 10:40
 * @Modify:
 */
public class leetcode547 {
    /**
     * 深度优先搜索
     * @param isConnected
     * @return
     */
    public int findCircleNum(int[][] isConnected) {
        int len = isConnected.length;
        boolean[] isVisit = new boolean[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (!isVisit[i]) {
                dfs(isConnected, isVisit, len, i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] isConnected, boolean[] isVisit, int len, int i) {
        for (int j = 0; j < len; j++) {
            if (isConnected[i][j] == 1 && !isVisit[j]) {
                isVisit[j] = true;
                dfs(isConnected, isVisit, len, j);
            }
        }
    }
}
