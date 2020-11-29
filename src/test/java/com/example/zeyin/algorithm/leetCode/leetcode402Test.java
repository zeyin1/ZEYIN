package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 17:06
 * @Modify:
 */
@SpringBootTest
public class leetcode402Test {

    @Test
    public void test() {
        String s = "1432219";
        String res = leetcode402.removeKdigits(s, 3);
        System.out.println(res);
    }
}
