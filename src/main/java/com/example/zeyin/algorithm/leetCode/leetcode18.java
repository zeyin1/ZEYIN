package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 四数之和
 * @Author: zeyin
 * @Date: 2021年03月01日 11:26
 * @Modify:
 */
public class leetcode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        if(nums.length<4) {
            return res;
        }

        for(int l=0;l<nums.length-3;l++) {
            for(int k=l+1;k<nums.length-2;k++) {
                int i=k+1,j=nums.length-1;
                while(i<j) {
                    if(nums[l]+nums[k]+nums[i]+nums[j]==target) {
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[l]);
                        list.add(nums[k]);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        res.add(list);
                        while(i<j&&nums[i]==nums[i+1])
                            i++;
                        while(i<j&&nums[j]==nums[j-1])
                            j--;
                    }
                    if(nums[i]+nums[j]+nums[k]+nums[l]<target)
                        i++;
                    else
                        j--;
                }
                while(k<nums.length-2&&nums[k]==nums[k+1]) {
                    k++;
                }
            }
            while(l<nums.length-3&&nums[l]==nums[l+1]) {
                l++;
            }
        }
        return res;
    }
}
