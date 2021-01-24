package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月24日 15:10
 * @Modify:
 */
@SpringBootTest
public class leetcode1143Test {

    @Test
    public void  test1(){
        String str1="abcde";
        String str2="ace";
        int res=leetcode1143.longestCommonSubsequence(str1,str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(res);
    }

}
