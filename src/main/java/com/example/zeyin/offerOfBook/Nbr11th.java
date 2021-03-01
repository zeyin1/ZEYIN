package com.example.zeyin.offerOfBook;

/**
 * @Description: 旋转数组的最小数字
 * @Author: zeyin
 * @Date: 2020年12月13日 15:54
 * @Modify:
 */
public class Nbr11th {

    public int method(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int l = 0;
        int r = nums.length - 1;
        int mid = l;
        while (nums[l] >= nums[r]) {
            if (r - l == 1) {
                mid = r;
                break;
            }

            mid = (l + r) / 2;
            if (nums[mid] >= nums[l]) {
                l = mid;
            } else if (nums[mid] <= nums[r]) {
                r = mid;
            }
        }
        return nums[mid];
    }


}
