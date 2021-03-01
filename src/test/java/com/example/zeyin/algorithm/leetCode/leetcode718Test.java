package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 17:15
 * @Modify:
 */
@SpringBootTest
public class leetcode718Test {

    @Test
    public void test() {
        int[] nums1 = {1, 2, 3, 2, 1};
        int[] nums2 = {3, 2, 1, 4, 7};
        int res = leetcode718.findLength(nums1, nums2);
        System.out.println(res);
    }
}
