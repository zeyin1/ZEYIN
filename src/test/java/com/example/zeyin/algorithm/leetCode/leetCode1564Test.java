package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月03日 21:47
 * @Modify:
 */
@SpringBootTest
public class leetCode1564Test {

    @Test
    public void test() {
        int[] boxes = {1, 2, 3};
        int[] wareHouse = {1, 2, 3, 4};
        assert leetCode1564.maxBoxesInWarehouse(boxes, wareHouse) == 1;
    }
}
