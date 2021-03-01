package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 13:43
 * @Modify:
 */
@SpringBootTest
public class leetcode1202Test {

    @Test
    public void test() {
        String s = "dcab";
        System.out.println(s);

        List<List<Integer>> pairs = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(0);
        list3.add(2);

        pairs.add(list1);
        pairs.add(list2);
        pairs.add(list3);

        String res = leetcode1202.smallestStringWithSwaps(s, pairs);

        System.out.println(res);


    }
}
