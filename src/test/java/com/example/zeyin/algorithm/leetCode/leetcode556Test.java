package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 9:30
 * @Modify:
 */
@SpringBootTest
public class leetcode556Test {

    @Test
    public void test() {
        int[] nums = {12, 21};
        for (int i = 0; i < nums.length; i++) {
            int res = leetcode556.nextGreaterElement(nums[i]);
            System.out.print(res + " ");
        }
    }
}
