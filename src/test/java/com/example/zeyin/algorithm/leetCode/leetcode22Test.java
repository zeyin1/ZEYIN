package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月20日 18:44
 * @Modify:
 */
@SpringBootTest
public class leetcode22Test {

    @Test
    public void test() {
        int n = 2;
        List<String> res = leetcode22.generateParenthesis(n);
        for (String temp : res) {
            System.out.println(temp);
        }
    }
}
