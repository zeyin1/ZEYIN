package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 15:09
 * @Modify:
 */
@SpringBootTest
public class leetcode1262Test {

    @Test
    public void test(){
        int[] nums={3,5,6,1,8};
        int res=leetcode1262.maxSumDivThree(nums);
        System.out.println(res);
    }

}
