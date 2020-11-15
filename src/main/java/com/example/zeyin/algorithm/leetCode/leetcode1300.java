package com.example.zeyin.algorithm.leetCode;

import java.util.Arrays;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月15日 15:42
 * @Modify:
 */
public class leetcode1300 {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;

        //求和
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }

        //最大值
        int r = arr[n - 1];
        int ans = 0, diff = target;
        //从1到最大值之间遍历
        for (int i = 1; i <= r; ++i) {
            //找到对应值的索引，没有值则返回-(插入点）
            int index = Arrays.binarySearch(arr, i);
            if (index < 0) {
                index = -index - 1;
            }

            //变更后的值
            int cur = prefix[index] + (n - index) * i;
            if (Math.abs(cur - target) < diff) {
                ans = i;
                diff = Math.abs(cur - target);
            }
        }
        return ans;
    }
}
