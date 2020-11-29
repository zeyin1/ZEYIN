package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 17:23
 * @Modify:
 */
@SpringBootTest
public class leetcode442Test {

    @Test
    public void test(){
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> res=leetcode442.findDuplicates(nums);
        System.out.println(res.toString());
    }
}
