package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月23日 22:49
 * @Modify:
 */
@SpringBootTest
public class leetcode139Test {

    @Test
    public void test(){
        String s=String.valueOf("leetcode");
        List<String> word=new ArrayList<>();
        word.add("leet");
        word.add("code");
        boolean res=leetcode139.wordBreak(s,word);
        System.out.println(res);
    }
}
