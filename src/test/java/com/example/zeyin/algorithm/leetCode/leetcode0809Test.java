package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年02月25日 14:47
 * @Modify:
 */
@SpringBootTest
public class leetcode0809Test {
    @Test
    public void test() {
        int n = 4;
        List<String> res = leetcode0809.generateParenthesis(n);
        System.out.println(res);
    }
}
