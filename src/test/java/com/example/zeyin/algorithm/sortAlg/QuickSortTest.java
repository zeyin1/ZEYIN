package com.example.zeyin.algorithm.sortAlg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月19日 16:03
 * @Modify:
 */
@SpringBootTest
public class QuickSortTest {

    @Test
    public void test() {
        int[] nums = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        QuickSort.quickSort(0, nums.length - 1,nums);
        System.out.println(Arrays.toString(nums));
    }

}
