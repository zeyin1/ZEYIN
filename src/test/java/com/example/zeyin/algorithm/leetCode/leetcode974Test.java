package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月19日 21:32
 * @Modify:
 */
@SpringBootTest
public class leetcode974Test {

    @Test
    public void test() {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        int res = leetCode974.subarraysDivByK(nums, k);
        System.out.println(res);
    }

    @Test
    public void  test1(){
        int[] nums={1,3,5,7,8,25,4,20};
        List<Integer> res= 平衡点.Method(nums);
        return;
    }
}
