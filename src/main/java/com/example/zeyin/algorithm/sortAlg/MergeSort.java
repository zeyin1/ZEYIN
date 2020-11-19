package com.example.zeyin.algorithm.sortAlg;

/**
 * @Description: 归并排序
 * @Author: zeyin
 * @Date: 2020年11月19日 16:28
 * @Modify:
 */
public class MergeSort {
    /**
     * （1）切分数组成两个数组
     * （2）合并两个数组的值（类似于两个链表）,到一个新数组
     * （3）把新数组的元素复制到原数组的对应位置
     * @param nums
     * @param low
     * @param high
     */

    public static void mergeSort(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        if (low >= high) {
            return;
        }

        //分开任务
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);

        //归并任务
        merge(nums, low, mid, high);
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int[] tmpNums = new int[high - low + 1];
        int i = low;//左数组的指针
        int j = mid + 1;//右数组的指针
        int k = 0;//新数组的指针

        //把较小的元素优先放到数组
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                tmpNums[k++] = nums[i++];
            } else {
                tmpNums[k++] = nums[j++];
            }
        }

        //把左边数组的元素加入
        while (i <= mid) {
            tmpNums[k++] = nums[i++];
        }
        //把右边数组的元素加入
        while (j <= high) {
            tmpNums[k++] = nums[j++];
        }

        //新数组的元素覆盖原数组的元素
        for (int i1 = 0; i1 < tmpNums.length; i1++) {
            nums[low + i1] = tmpNums[i1];
        }
    }

}
