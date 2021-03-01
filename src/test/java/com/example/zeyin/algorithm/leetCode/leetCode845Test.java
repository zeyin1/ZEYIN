package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月03日 21:23
 * @Modify:
 */
@SpringBootTest
public class leetCode845Test {


    @Test
    public void test() {
        int[] A = {2, 1, 4, 7, 3, 2, 5};
        assert leetCode845.longestMountain(A) == 5;
    }
}
