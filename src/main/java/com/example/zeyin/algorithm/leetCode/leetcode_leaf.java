package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年10月15日 17:20
 * @Modify:
 */
public class leetcode_leaf {
    public int minimumOperations(String leaves) {
        int len = leaves.length();
        int[][] f = new int[len][3];
        f[0][0] = isYellow(leaves.charAt(0));

        f[0][1] = f[0][2] = f[1][2] = Integer.MAX_VALUE;

        for (int i = 1; i < len; i++) {
            int isRed = isRed(leaves.charAt(i));
            int isYellow = isYellow(leaves.charAt(i));
            f[i][0] = f[i - 1][0] + isYellow;
            f[i][1] = Math.min(f[i - 1][0], f[i - 1][1]) + isRed;
            if (i >= 2) {
                f[i][2] = Math.min(f[i - 1][1], f[i - 1][2]) + isYellow;
            }
        }
        return f[len - 1][2];
    }

    private int isYellow(char c) {
        return c == 'y' ? 1 : 0;
    }

    private int isRed(char c) {
        return c == 'r' ? 1 : 0;
    }
}
