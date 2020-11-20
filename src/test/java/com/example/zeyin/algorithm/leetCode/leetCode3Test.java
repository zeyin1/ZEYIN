package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月20日 18:26
 * @Modify:
 */
@SpringBootTest
public class leetCode3Test {

    @Test
    public void test(){
        String s=String.valueOf("abcabcbb");
        int res=leetcode3.method(s);
        System.out.println(res);
    }
}
