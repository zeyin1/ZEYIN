package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 11:34
 * @Modify:
 */
@SpringBootTest
public class leetcode31Test {

    @Test
    public void test() {
        int[] nums = {1, 5, 8, 4, 7};
        leetcode31.nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
