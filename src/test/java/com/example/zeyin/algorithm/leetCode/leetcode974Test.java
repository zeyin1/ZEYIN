package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月19日 21:32
 * @Modify:
 */
@SpringBootTest
public class leetcode974Test {

    @Test
    public void test() {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        int res = leetCode974.subarraysDivByK(nums, k);
        System.out.println(res);
    }
}
