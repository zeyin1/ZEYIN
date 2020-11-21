package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 10:22
 * @Modify:
 */
@SpringBootTest
public class leetcode56Test {

    @Test
    public void test() {
        int[][] nums = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] res = leetcode56.merge(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }
}
