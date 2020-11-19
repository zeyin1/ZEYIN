package com.example.zeyin.algorithm.sortAlg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 冒泡排序
 * @Author: zeyin
 * @Date: 2020年11月19日 16:26
 * @Modify:
 */
@SpringBootTest
public class BubleSortTest {

    @Test
    public void test() {
        int[] nums = DataSource.returnNums();
        BubleSort.bubleSort(nums);
        DataSource.print(nums);
    }
}
