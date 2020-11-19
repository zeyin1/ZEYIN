package com.example.zeyin.algorithm.sortAlg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 归并排序
 * @Author: zeyin
 * @Date: 2020年11月19日 16:28
 * @Modify:
 */
@SpringBootTest
public class MergeSortTest {

    @Test
    public void test() {
        int[] nums = DataSource.returnNums();
        MergeSort.mergeSort(nums, 0, nums.length - 1);
        DataSource.print(nums);
    }
}
