package com.example.zeyin.offerOfBook;

import java.util.HashMap;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年12月13日 13:57
 * @Modify:
 */
public class Nbr3th {

    public boolean duplicate(int[] nums, int len, int[] duplication) {

        if (nums == null || nums.length == 0) {
            return false;
        }

        boolean flag = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                flag = true;
                duplication[0] = num;
                break;
            }
            map.put(num, 0);
        }
        return flag;
    }
}
