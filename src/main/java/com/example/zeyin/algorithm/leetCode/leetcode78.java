package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 18:20
 * @Modify:
 */

import java.util.ArrayList;
import java.util.List;

public class leetcode78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());//空集

        for (int num : nums) {
            int size = res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> tmpList = new ArrayList<>(res.get(i));
                tmpList.add(num);
                res.add(tmpList);
            }
        }
        return res;
    }
}
