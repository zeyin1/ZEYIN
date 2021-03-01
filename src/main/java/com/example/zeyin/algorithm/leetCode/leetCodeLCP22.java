package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月02日 21:27
 * @Modify:
 */
public class leetCodeLCP22 {

    public static int paintingPlan(int n, int k) {

        if (k == n * n) {
            return 1;
        }

        int wCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i * n + (n - i) * j == k) {
                    wCount += sumC(n, i) * sumC(n, j);
                }
            }
        }
        return wCount;
    }

    private static int sumC(int n, int m) {
        return recurrence(n) / (recurrence(m) * recurrence(n - m));
    }

    private static int recurrence(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * recurrence(n - 1);
    }
}
