package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 11:05
 * @Modify:
 */
@SpringBootTest
public class leetcode46Test {

    @Test
    public void test(){
        int[] nums={1,2,3};
        List<List<Integer>> res=leetcode46.permute(nums);
        for (List<Integer> list:res){
            System.out.println(list.toString());
        }
    }

}
