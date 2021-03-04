package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 合并区间
 *
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 *
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 *
 * @Author: zeyin
 * @Date: 2020年11月21日 10:10
 * @Modify:
 */
public class leetcode56 {

    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        //对区间起点进行排序（左节点进行排序）
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //合并区间
        int i = 0;
        while (i < intervals.length) {
            int left = intervals[i][0];
            int right = intervals[i][1];

            //合并区间操作
            while (i < intervals.length - 1 && intervals[i + 1][0] <= right) {
                i++;
                right = Math.max(right, intervals[i][1]);//区间的右边界更新
            }
            //加入结果集
            res.add(new int[]{left, right});

            //下一个合并后的区间
            i++;
        }
        return res.toArray(new int[0][]);
    }
}
