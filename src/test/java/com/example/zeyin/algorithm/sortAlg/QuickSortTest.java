package com.example.zeyin.algorithm.sortAlg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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
        int[] nums = DataSource.returnNums();
        QuickSort.quickSort(0, nums.length - 1, nums);
    }

}
