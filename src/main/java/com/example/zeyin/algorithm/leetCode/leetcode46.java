package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Description: 全排列
 * @Author: zeyin
 * @Date: 2020年11月21日 10:48
 * @Modify:
 */
public class leetcode46 {
    /**
     * @Description:
     * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
     *
     * 输入: [1,2,3]
     * 输出:
     * [
     *   [1,2,3],
     *   [1,3,2],
     *   [2,1,3],
     *   [2,3,1],
     *   [3,1,2],
     *   [3,2,1]
     * ]
     *方法：深度优先搜索+回溯
     *
     * @Author: zeyin
     * @Date: 2021/3/4 9:13
     */

    private static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> permute(int[] nums) {
        Deque<Integer> queue = new ArrayDeque<>();
        //是否使用过的标记
        boolean[] used = new boolean[nums.length];
        dfs(nums, nums.length, 0, queue, used);
        return res;
    }

    private static void dfs(int[] nums, int len, int depth, Deque<Integer> queue, boolean[] used) {

        //需要的结果（停止搜索）
        if (depth == len) {
            res.add(new ArrayList<>(queue));
            return;
        }

        for (int i = 0; i < len; i++) {

            //使用过
            if (used[i]) {
                continue;
            }

            //队尾加入元素
            queue.addLast(nums[i]);
            used[i] = true;

            //深度搜索
            dfs(nums, len, depth + 1, queue, used);
            //回溯
            queue.removeLast();//释放该元素
            used[i] = false;
        }

    }
}
