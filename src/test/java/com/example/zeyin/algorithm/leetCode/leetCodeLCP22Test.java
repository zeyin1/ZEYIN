package com.example.zeyin.algorithm.leetCode;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月02日 21:34
 * @Modify:
 */
@SpringBootTest
public class leetCodeLCP22Test {

    @Test
    public void test1(){
        leetCodeLCP22 res=new leetCodeLCP22();
        assert (res.paintingPlan(2,2)==4);
    }
}
