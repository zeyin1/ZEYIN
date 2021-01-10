package com.example.zeyin.Exception;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月10日 14:14
 * @Modify:
 */
@SpringBootTest
public class ExceptionForLearnTest {

    @Test
    public void test() {
        ExceptionForLearn.ArrayException();
    }

    @Test
    public void test2() {
        ExceptionForLearn.mathException();
    }

    @Test
    public void test3() {
        int res = ExceptionForLearn.FinallyException();
        System.out.print("结果： " + res);
    }

    @Test
    public void test4() {
        int res = ExceptionForLearn.FinallyException1();
        System.out.print("结果： " + res);
    }

    @Test
    public void test5() {
        int res = ExceptionForLearn.FinallyException2();
        System.out.print("结果： " + res);
    }

    @Test
    public void tesst6() throws MyOwnException {
        ExceptionForLearn.myOwnException();
    }
}
