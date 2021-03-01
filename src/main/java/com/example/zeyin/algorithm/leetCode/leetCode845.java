package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月03日 21:23
 * @Modify:
 */
public class leetCode845 {

    public static int longestMountain(int[] A) {

        int len = A.length;
        int[] left = new int[len];
        for (int i = 1; i < len; i++) {
            //没有算本身
            left[i] = A[i] > A[i - 1] ? left[i - 1] + 1 : 0;
        }

        int[] right = new int[len];
        for (int i = len - 2; i >= 0; i--) {
            //没有算本身
            right[i] = A[i] > A[i + 1] ? right[i + 1] + 1 : 0;
        }

        int res = 0;
        for (int i = 0; i < len; i++) {
            if (left[i] > 0 && right[i] > 0) {
                res = Math.max(res, left[i] + right[i] + 1);
            }
        }
        return res;
    }
}
