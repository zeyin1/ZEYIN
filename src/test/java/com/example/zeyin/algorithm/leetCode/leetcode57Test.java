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
public class leetcode57Test {

    @Test
    public void test() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] res = leetcode57.insert(intervals, newInterval);
    }
}
