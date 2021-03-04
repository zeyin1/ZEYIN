package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 子集
 *
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 示例 2：
 *
 * 输入：nums = [0]
 * 输出：[[],[0]]
 *
 *
 * @Author: zeyin
 * @Date: 2020年11月21日 18:20
 * @Modify:
 */

import java.util.ArrayList;
import java.util.List;

public class leetcode78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        //空集
        res.add(new ArrayList<>());

        //res所有的集合都加上元素num，组成新的集合
        for (int num : nums) {
            int size = res.size();

            //现有res集合,加上元素num，组成新的集合
            for (int i = 0; i < size; i++) {
                List<Integer> list = new ArrayList<>(res.get(i));
                list.add(num);
                res.add(list);
            }
        }
        return res;
    }
}
