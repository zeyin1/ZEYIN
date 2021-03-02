package com.example.zeyin.algorithm.leetCode;

/**
 * @Description:
 * @Author: zeyin
 * @Date: 2020年11月29日 16:31
 * @Modify:
 */
public class leetcode10_03 {
    /**
     * 输入: arr = [15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14], target = 5
     * 输出: 8（元素5在该数组中的索引）
     * 方法：使用二分查找
     *
     * @param arr
     * @param target
     * @return
     */
    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            //中间节点
            int mid = left + (right - left >> 1);

            //大于等于目标值，往左边靠
            if (arr[mid] >= target) {
                //目标值在右侧一段（找最小索引值，先比较右边）
                if (arr[right] < arr[mid] && arr[right] >= target) {
                    left = mid + 1;
                } else {
                    //目标值在左侧一段
                    right = mid - 1;
                }
            } else {
                if (arr[mid] < arr[left] && target >= arr[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        if (left < arr.length && arr[left] == target) return left;
        return -1;
    }
}
