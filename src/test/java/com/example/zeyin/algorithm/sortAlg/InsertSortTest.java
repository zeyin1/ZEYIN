package com.example.zeyin.algorithm.sortAlg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 插入排序
 * @Author: zeyin
 * @Date: 2020年11月19日 16:27
 * @Modify:
 */
@SpringBootTest
public class InsertSortTest {

    @Test
    public void test(){
        int[] nums=DataSource.returnNums();
        InsertSort.insertSort(nums);
        DataSource.print(nums);
    }

}
