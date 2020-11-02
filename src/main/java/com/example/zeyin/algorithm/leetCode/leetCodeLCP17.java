package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月02日 22:01
 * @Modify:
 */
public class leetCodeLCP17 {

    public static int calculate(String s) {

        int x=1;
        int y=0;

        char[] nums=s.toCharArray();
        for (int i=0;i<s.length();i++){
            if (nums[i]=='A'){
                x=2*x+y;
            }else if (nums[i]=='B'){
                y=2*y+x;
            }
        }

        return x+y;

    }
}
