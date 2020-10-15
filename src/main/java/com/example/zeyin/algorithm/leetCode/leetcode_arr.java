package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年10月15日 17:48
 * @Modify:
 */
public class leetcode_arr {
    public int kConcatenationMaxSum(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        long maxOfEnd = arr[0] > 0 ? arr[0] : 0;
        long maxOfFar = maxOfEnd;
        long sum = arr[0];

        for (int i = 1; i < Math.min(k, 2) * arr.length; i++) {
            maxOfEnd = Math.max(maxOfEnd + arr[i % arr.length], arr[i % arr.length]);
            maxOfFar = Math.max(maxOfFar, maxOfEnd);
            if (i < arr.length) {
                sum += arr[i];
            }
        }

        //sum大于0，加上剩余长度；sum小于等于0，两个复制已经最大
        while (sum > 0 && --k >= 2) {
            maxOfFar = (maxOfFar + sum) % 1000000007;
        }
        return (int) maxOfFar;
    }
}
