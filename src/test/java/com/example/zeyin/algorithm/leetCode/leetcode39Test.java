package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月22日 16:44
 * @Modify:
 */
@SpringBootTest
public class leetcode39Test {

    @Test
    public void test(){
        int[] nums={2,3,6,7};
        List<List<Integer>> res=leetcode39.combinationSum(nums,7);
    }
}
