package com.example.zeyin.algorithm.leetCode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月23日 22:39
 * @Modify:
 */
public class leetcode139 {

    //dp[i]表示之前的字符串都可以做成字符串，
    //0<j<i,[0,j]、[j+1,i]也可以组成字符串
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet=new HashSet<>(wordDict);
        boolean[] dp=new boolean[s.length()+1];

        dp[0]=true;//一个元素也没有
        for (int i=1;i<=s.length();i++){
            for (int j=0;j<i;j++){
                if (dp[j]&&wordSet.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
