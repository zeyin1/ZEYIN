package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月22日 16:19
 * @Modify:
 */
public class leetcode34 {

    //二分查找
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        if (nums==null||nums.length==0){
            return res;
        }

        int len=nums.length;
        int l=0,r=len-1;
        int mid=0;
        while (l<=r){
            mid=(l+r)/2;
            if (nums[mid]==target){
                break;
            }else if (nums[mid]>target){
                r=mid-1;
            }else {
                l=mid+1;
            }
        }

        if (l<=r){
            l=mid-1;
            while (l>=0&&nums[l]==nums[mid]){
                l--;
            }

            r=mid+1;
            while (r<len&&nums[r]==nums[mid]){
                r++;
            }


            res[0]=l+1;
            res[1]=r-1;
        }
        return res;
    }
}
