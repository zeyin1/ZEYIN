package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 12:32
 * @Modify:
 */
public class leetcode1283 {

    //二分查找
    public int smallestDivisor(int[] nums, int threshold) {
        //除数的最小值
        int l = 1;
        //除数的最大值
        int r = nums[nums.length - 1];

        int res = -1;
        while (l <= r) {

            int mid = (l + r) / 2;
            int total = cal(nums, mid);
            if (total > threshold)
                l = mid + 1;
            else {
                //一直循环找到最小的除数
                res = mid;
                r = mid - 1;
            }
        }
        return res;
    }

    private int cal(int[] nums, int div) {
        int sum = 0;
        for (int n : nums) {
            sum += n / div;
            // 向上取整
            if (n % div != 0) sum += 1;
        }
        return sum;
    }
}
