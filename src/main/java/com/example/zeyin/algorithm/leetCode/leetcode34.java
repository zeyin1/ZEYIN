package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 在排序数组中查找元素的第一个和最后一个位置
 * @Author: zeyin
 * @Date: 2020年11月22日 16:19
 * @Modify:
 */
public class leetcode34 {
    /**
     * @Description:
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     * 如果数组中不存在目标值 target，返回 [-1, -1]。
     * 进阶：
     * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
     *
     * 输入：nums = [5,7,7,8,8,10], target = 8
     * 输出：[3,4]
     *
     * 输入：nums = [5,7,7,8,8,10], target = 6
     * 输出：[-1,-1]
     *
     * @Author: zeyin
     * @Date: 2021/3/2 11:21
     */

    //二分查找
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums == null || nums.length == 0) {
            return res;
        }

        int len = nums.length;
        int l = 0, r = len - 1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target) {
                break;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        //此处可以继续二分查找
        if (l <= r) {
            l = mid - 1;
            while (l >= 0 && nums[l] == nums[mid]) {
                l--;
            }

            r = mid + 1;
            while (r < len && nums[r] == nums[mid]) {
                r++;
            }


            res[0] = l + 1;
            res[1] = r - 1;
        }
        return res;
    }
}
