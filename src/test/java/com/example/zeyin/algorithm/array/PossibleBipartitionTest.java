package com.example.zeyin.algorithm.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年08月15日 9:26
 * @Modify:
 */

@SpringBootTest
@Slf4j
public class PossibleBipartitionTest {

    @Resource
    private PossibleBipartition mPossibleBipartition;

    @Test
    public  void test1(){
        int n=4;
        int[][] nums={{1,2},
                {1,3},
                {2,4}};
        mPossibleBipartition.possibleBipartition(n,nums);
    }

}
