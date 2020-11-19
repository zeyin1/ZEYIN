package com.example.zeyin.algorithm.sortAlg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 希尔排序
 * @Author: zeyin
 * @Date: 2020年11月19日 16:27
 * @Modify:
 */
@SpringBootTest
public class SheelSortTest {

    @Test
    public void test(){
        int[] nums = DataSource.returnNums();
        SheelSort.sheelSort(nums);
        DataSource.print(nums);
    }

}
