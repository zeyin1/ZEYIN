package com.example.zeyin.algorithm.sortAlg;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月19日 17:11
 * @Modify:
 */
public class SortUtil {

    public static void exchange(int i, int j, int[] nums) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
