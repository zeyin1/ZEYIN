package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月24日 15:35
 * @Modify:
 */
@SpringBootTest
public class leetcode316Test {

    @Test
    public void test1() {
        String s = "bcabc";
        String res = leetcode316.removeDuplicateLetters(s);
        System.out.println(s);
        System.out.println(res);
    }
}
