package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 15:22
 * @Modify:
 */
@SpringBootTest
public class leetcode424Test {

    @Test
    public void test(){
        String s="AABABBA";
        int k=1;

        int len=leetcode424.characterReplacement(s,k);

        System.out.println(len);

    }

}
