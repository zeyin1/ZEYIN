package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 9:51
 * @Modify:
 */
@SpringBootTest
public class leetcode33Test {

    @Test
    public void test() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        int res = leetcode33.search1(nums, target);
        System.out.println(res);

        res = leetcode33.search2(nums, target);
        System.out.println(res);
    }
}
