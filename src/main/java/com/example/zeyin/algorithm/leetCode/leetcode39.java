package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:  组合总和
 *
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的数字可以无限制重复被选取。
 *
 * 说明：
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。
 *
 *
 * 输入：candidates = [2,3,6,7], target = 7,
 * 所求解集为：
 * [
 *   [7],
 *   [2,2,3]
 * ]
 *
 * @Author: zeyin
 * @Date: 2020年11月22日 16:31
 * @Modify:
 */
public class leetcode39 {
    /**
     * 回溯
     * res存储最终结果
     * list存储单个结果（临时链表，回溯处理）
     *
     * @param candidates
     * @param target
     * @return
     */
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (candidates == null || candidates.length < 1) {
            return res;
        }
        Arrays.sort(candidates);

        backtrack(candidates, target, res, new ArrayList<Integer>(), 0);

        return res;
    }

    private static void backtrack(int[] nums, int target, List<List<Integer>> res, ArrayList<Integer> list, int start) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(list);
            return;
        }

        //以i开始的元素作为头节点
        for (int i = start; i < nums.length && target >= nums[i]; i++) {
            //存入
            list.add(nums[i]);
            backtrack(nums, target - nums[i], res, new ArrayList<Integer>(list), i);
            //取出
            list.remove(list.size() - 1);
        }
    }
}
