package com.example.zeyin.algorithm.sortAlg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 选择排序
 * @Author: zeyin
 * @Date: 2020年11月19日 16:27
 * @Modify:
 */
@SpringBootTest
public class SelectionSortTest {

    @Test
    public void test() {
        int[] nums = DataSource.returnNums();
        SelectionSort.selectionSort(nums);
        DataSource.print(nums);
    }
}
