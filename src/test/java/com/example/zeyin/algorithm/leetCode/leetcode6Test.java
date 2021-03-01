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
public class leetcode6Test {

    @Test
    public void test() {
        String input = String.valueOf("PAYPALISHIRING");
        int index=3;
        String res = leetcode6.convert(input,index);
        System.out.println(res);
    }
}
