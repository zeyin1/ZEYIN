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
public class leetcode71Test {

    @Test
    public void test() {
        String str="/home//foo/";
        String res=leetcode71.simplifyPath(str);
        System.out.println(str);
        System.out.println(res);
    }

}
