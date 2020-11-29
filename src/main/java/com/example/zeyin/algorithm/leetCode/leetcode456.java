package com.example.zeyin.algorithm.leetCode;

import java.util.Stack;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 15:53
 * @Modify:
 */
public class leetcode456 {
    public boolean find132pattern(int[] nums) {

        if(nums.length<3){
            return false;
        }
        int second = Integer.MIN_VALUE;
        Stack<Integer> stack =new Stack<>();
        stack.add(nums[nums.length-1]);

        //从右到左，找到次大的元素
        for(int i=nums.length-2;i>=0;i--){

            //较小元素（左侧）
            if(nums[i]<second){
                return true;
            }else {
                while (!stack.isEmpty()&&nums[i]>stack.peek()){
                    //次大元素
                    second=Math.max(stack.pop(),second);
                }
                //最大元素
                stack.push(nums[i]);
            }
        }
        return false;
    }
}
