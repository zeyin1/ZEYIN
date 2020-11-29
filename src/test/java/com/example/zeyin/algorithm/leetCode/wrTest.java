package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月25日 20:28
 * @Modify:
 */
@SpringBootTest
public class wrTest {

    @Test
    public void test() {
        int[][] nums = {{1, 0, 1}, {1, 1, 1}, {1, 1, 0}};
        print(nums);
        System.out.println();
        int[][] res = wr.Method(nums);
        print(res);
    }

    private void print(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
