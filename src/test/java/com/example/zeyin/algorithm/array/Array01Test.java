package com.example.zeyin.algorithm.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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
    public void arrayTest() {
        int[] array1={1,2,3,4,5,7,6,4,2,2};
        System.out.println("----测试1-----------");
        System.out.println(Array01.duplicate01(array1));
        System.out.println("----测试2-----------");
        System.out.println(Array01.duplicate02(array1));
    }

    /**
    * @Description: 找到有序数组的第一个重复元素，并输出
    * @Author: zeyin
    * @Date: 2020/4/5 17:16
    * @Modify:
    * @Param:
    * @Return:
    */
    @Test
    public void arrayTest02(){
        int[] array1={1,2,3,4,4,5,7,8};
        System.out.println(Array01.removeDuplicates(array1));
    }
}
