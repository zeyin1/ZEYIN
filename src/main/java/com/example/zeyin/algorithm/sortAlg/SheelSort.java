package com.example.zeyin.algorithm.sortAlg;

/**
 * @Description: 希尔排序
 * @Author: zeyin
 * @Date: 2020年11月19日 16:27
 * @Modify:
 */
public class SheelSort {
    /**
     * 每次切分一半，相隔K(len/2)距离的数值进行比较
     * 相隔len距离，把元素放入对应位置，较大的元素往前放
     *
     * @param nums
     */

    public static void sheelSort(int[] nums) {
        int len = nums.length;

        while (len != 0) {
            //每次切分一半
            len = len / 2;
            for (int i = 0; i < len; i++) {
                for (int j = i + len; j < nums.length; j = j + len) {
                    int k = j - len;//第一个数组的最后一位
                    int tmpNum = nums[j];//第二个数组的最后一位

                    while (k >= 0 && tmpNum < nums[k]) {//从后往前遍历（第二个数组的元素小于第一个数组的元素）
                        nums[k + len] = nums[k];//向后移动len位（第一个数组元素向后移动len位）
                        k = k - len;
                    }
                    nums[k + len] = tmpNum;

                }

            }

        }

    }
}
