package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * 给定正整数数组 A，A[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的距离为 j - i。
 *
 * 一对景点（i < j）组成的观光组合的得分为（A[i] + A[j] + i - j）：景点的评分之和减去它们两者之间的距离。
 *
 * 返回一对观光景点能取得的最高分。
 * @Author: zeyin
 * @Date: 2020年10月18日 19:54
 * @Modify:
 */
public class leetcode1014_最佳观光组合 {
    /**
     *val=A[i]+A[j]+i-j;i<j;
     * val=(A[j]-j)+(A[i]+i);
     */
    public int maxScoreSightseeingPair(int[] A) {
        int res=0;
        int max=A[0];
        for (int i=1;i<A.length;++i){
            res=Math.max(res,max+A[i]-i);
            max=Math.max(max,A[i]+i);
        }
        return res;
    }
}
