package com.example.zeyin.algorithm.leetCode;

import java.util.PriorityQueue;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 11:09
 * @Modify:
 */
public class leetcode215 {

    public static int findKthLargest(int[] nums, int k) {
        if (nums==null||nums.length<k){
            return Integer.MAX_VALUE;
        }

        PriorityQueue<Integer> queue=new PriorityQueue<>(k);
        for (int i=0;i<k;i++){
            queue.add(nums[i]);
        }

        for (int i=k;i<nums.length;i++){
            if (nums[i]>queue.peek()){
                queue.poll();
                queue.add(nums[i]);
            }
        }

        return queue.poll();//第K大元素

    }
}
