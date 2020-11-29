package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 13:15
 * @Modify:
 */
@SpringBootTest
public class leetcode777Test {

    @Test
    public void test(){
        String s1="RXXLRXRXL";
        String s2="XRLXXRRLX";
        boolean flg=leetcode777.canTransform(s1,s2);
        System.out.println(flg);
    }
}
