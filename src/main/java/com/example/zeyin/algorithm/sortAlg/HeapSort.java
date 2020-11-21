package com.example.zeyin.algorithm.sortAlg;

import com.example.zeyin.util.MethodUtil;

/**
 * @Description: 堆排序
 * @Author: zeyin
 * @Date: 2020年11月19日 16:28
 * @Modify:
 */
public class HeapSort {
    /**
     * 对简单选择排序的优化；将序列构建成大顶堆。
     * 将根节点与最后一个结点交换，然后断开最后一个结点。
     * 重复第一、二步，直到所有结点断开。
     */

    //最大堆
    public static void heapSort(int[] nums) {
        int len = nums.length;

        //(1)构建顶堆
        for (int i = len / 2; i >= 0; i--) {
            heapAdjust(nums, i, len);//从第一个非叶子节点，从下往上，从右往左调整结构
        }

        //(2)调整堆结构，交换堆顶元素与末尾元素
        for (int i = len - 1; i > 0; i--) {
            MethodUtil.exchange(0, i, nums);//堆顶元素与末尾元素交换
            heapAdjust(nums, 0, i);//重新对堆进行调整，得到i-1个节点的堆
        }
    }

    private static void heapAdjust(int[] nums, int i, int len) {

        int tmpNum = nums[i];//取出当前元素(父节点)
        //从节点i的左节点（2i+1）开始
        for (int k = 2 * i + 1; k < len; k = 2 * k) {
            //左节点小于右节点，k指向右节点
            if (k + 1 < len && nums[k] < nums[k + 1]) {
                k++;
            }

            //子节点大于父节点，将子节点赋给父节点
            if (nums[k] > tmpNum) {
                nums[i] = nums[k];
                i = k;//索引赋值
            } else {
                break;
            }
        }

        //将父节点放到最终位置
        nums[i] = tmpNum;
    }
}
