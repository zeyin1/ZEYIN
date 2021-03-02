package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 搜索旋转排序数组
 * @Author: zeyin
 * @Date: 2020年11月21日 9:43
 * @Modify:
 */
public class leetcode33 {
    /**
     * （1）先比较目标值与mid的值大小
     *     1、相等，则返回索引
     *     2、不相等
     * （2）再判断mid的位置
     *     1、在左侧数组的升序部分
     *         目标值在l和mid的值之间，锁定区间，反之另外一个区间
     *     2、在右侧数组的升序部分
     *         目标值在mid和r的值之间，锁定区间，反之另外一个区间
     */

    //递归方式实现
    private static int res1 = -1;

    public static int search1(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return res1;
        }
        method1(nums, 0, nums.length - 1, target);
        return res1;
    }

    private static void method1(int[] nums, int l, int r, int target) {
        if (l > r) {
            return;
        }
        int mid = (r + l) / 2;
        if (nums[mid] == target) {
            res1 = mid;
        }

        //递归
        if (nums[mid] >= nums[l]) {
            if (nums[l] < target && target < nums[mid]) {
                method1(nums, l, mid - 1, target);
            } else {
                method1(nums, mid + 1, r, target);
            }
        } else {
            if (nums[mid] < target && target < nums[r]) {
                method1(nums, mid + 1, r, target);
            } else {
                method1(nums, l, mid - 1, target);
            }
        }
    }


    //非递归方式实现
    public static int search2(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }

        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[l] <= nums[mid]) {
                if (nums[l] < target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target < nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

}
