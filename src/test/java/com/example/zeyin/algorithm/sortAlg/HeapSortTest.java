package com.example.zeyin.algorithm.sortAlg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 堆排序
 * @Author: zeyin
 * @Date: 2020年11月19日 16:28
 * @Modify:
 */
@SpringBootTest
public class HeapSortTest {

    @Test
    public void test(){
        int[] nums=DataSource.returnNums();
        HeapSort.heapSort(nums);
        DataSource.print(nums);
    }
}
