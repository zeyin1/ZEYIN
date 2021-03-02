package com.example.zeyin.algorithm.leetCode;

import java.util.Arrays;

/**
 * @Description: 最接近的三数之和
 * @Author: zeyin
 * @Date: 2021年03月01日 11:21
 * @Modify:
 */
public class leetcode16 {
    public int threeSumClosest(int[] nums, int target) {

        //最小差值
        long minDiff=Long.MAX_VALUE;
        //返回结果
        long result=0;

        //一次处理的内部差值
        long diff;
        long sum;

        //排序
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++) {
            int j=i+1;
            int k=nums.length-1;

            while(j<k) {
                sum=nums[i]+nums[j]+nums[k];
                diff=Math.abs(target-sum);

                if(diff==0)
                    return (int)sum;

                if(diff<minDiff) {
                    minDiff=diff;
                    result=sum;
                }

                if(sum>target) {
                    k--;
                }
                else {
                    j++;
                }
            }
        }
        return (int)result;
    }
}
