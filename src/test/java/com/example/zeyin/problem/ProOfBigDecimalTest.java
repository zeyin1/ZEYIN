package com.example.zeyin.problem;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月16日 10:01
 * @Modify:
 */
@SpringBootTest
public class ProOfBigDecimalTest {

    @Test
    public void test1(){
        ProOfBigDecimal.method1();
    }
    @Test
    public void test2(){
        ProOfBigDecimal.method2();
    }

    @Test
    public void test3(){
        //正数向上取整（1.5->2），负数向上取整(-1.5->-1)
      long res=  Math.round(-1.5);
      System.out.println(res);
    }
}
