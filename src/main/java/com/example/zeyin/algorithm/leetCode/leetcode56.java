package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 10:10
 * @Modify:
 */
public class leetcode56 {

    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        //对区间起点进行排序
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //合并区间
        int i = 0;
        while (i < intervals.length) {
            int left = intervals[i][0];
            int right = intervals[i][1];

            while (i < intervals.length - 1 && intervals[i + 1][0] <= right) {
                i++;
                right = Math.max(right, intervals[i][1]);//区间的右边界更新
            }
            res.add(new int[]{left, right});
            i++;//下一个合并后的区间
        }
        return res.toArray(new int[0][]);
    }
}
