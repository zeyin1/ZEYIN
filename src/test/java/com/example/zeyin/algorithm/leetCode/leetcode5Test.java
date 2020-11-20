package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月20日 21:32
 * @Modify:
 */
@SpringBootTest
public class leetcode5Test {

    @Test
    public void test() {
        String s = String.valueOf("babad");
        String res = leetcode5.longestPalindrome(s);
        System.out.println(res);
    }
}
