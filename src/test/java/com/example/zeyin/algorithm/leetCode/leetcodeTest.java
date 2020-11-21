package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 18:59
 * @Modify:
 */
@SpringBootTest
public class leetcodeTest {

    @Test
    public void test() {
        int[] nums = {1, 4, 4, 2, 2, 3,3};
        int[] res = leetcode347.topKFrequent(nums, 2);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
