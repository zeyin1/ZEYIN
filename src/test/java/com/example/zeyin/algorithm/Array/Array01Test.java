package com.example.zeyin.algorithm.Array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Discription: 数组测试类
 * @Author: zeyin
 * @Date: 2020/3/22 12:27
 * @Modified:
 */
@SpringBootTest
@Slf4j
public class Array01Test {

    /**
     * @Description: 数组测试
     * @Author: zeyin
     * @Date: 2020/3/22 12:28
     * @Param:
     * @Return:
     */
    @Test
    public void ArrayTest() {
        int[] array1={1,2,3,4,5,7,6,4,2};
        System.out.println(Array01.duplicate(array1));
    }
}
