package com.example.zeyin.offerOfBook;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年12月13日 14:03
 * @Modify:
 */
public class Nbr4th {

    /**
     * @Description: 二维数组中的查找
     * @Author: zeyin
     * @Date: 2020/12/13 14:03
     */
    public boolean find(int target, int[][] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int i = 0;
        int j = nums[0].length - 1;
        while (i < nums.length && j >= 0) {
            if (nums[i][j] == target) {
                return true;
            } else if (nums[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
