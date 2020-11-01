package com.example.zeyin.algorithm.leetCode;

import java.util.Arrays;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月01日 18:01
 * @Modify:
 */
public class leetcodeLCP18 {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {

        Arrays.sort(staple);
        Arrays.sort(drinks);
        int i = 0;
        int j = drinks.length - 1;
        int count = 0;
        while (i < staple.length && j >= 0) {
            if (staple[i] + drinks[j] <= x) {
                count = (count + j + 1) % 1000000007;
                i++;
            } else {
                j--;
            }
        }
        return count % 1000000007;
    }
}
