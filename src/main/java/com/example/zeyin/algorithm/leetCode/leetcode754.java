package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 16:08
 * @Modify:
 */
public class leetcode754 {
    public int reachNumber(int target) {
        target=Math.abs(target);
        int maxPos=0;
        int steps=1;
        while (target>maxPos||(maxPos-target)%2!=0)
            maxPos+=steps++;
        return steps-1;
    }
}
