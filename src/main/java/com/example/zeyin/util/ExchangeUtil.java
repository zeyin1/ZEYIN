package com.example.zeyin.util;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月19日 17:11
 * @Modify:
 */
public class ExchangeUtil {

    public static void exchange(int i, int j, int[] nums) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void exchange(int i, int j, char[] nums) {
        char tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
