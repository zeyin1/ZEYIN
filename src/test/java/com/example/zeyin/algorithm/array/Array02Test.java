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
public class Array02Test {

    /**
     * @Description: 数组测试
     * @Author: zeyin
     * @Date: 2020/3/22 12:28
     * @Param:
     * @Return:
     */
    @Test
    public void ArrayTest() {
        int[][] array1={{1,2,3},
                        {5,7,6},
                        {4,2,2}};
        System.out.println("----测试1-----------");
        int[][] wDesArr=Array02.NumMatrix(array1);

        for(int i=0;i<wDesArr.length-1;i++){
            for(int j=0;j<wDesArr[0].length-1;j++){
                System.out.print(wDesArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
