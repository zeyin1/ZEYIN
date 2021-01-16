package com.example.zeyin.problem;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月16日 10:22
 * @Modify:
 */
@SpringBootTest
public class ProOfThreadTest {

    /**
     * @Description: 测试1
     * @Author: zeyin
     * @Date: 2021/1/16 10:26
     */
    public static void main(String[] args) {
        //ProOfThread.runDAfterABC();
        //ProOfThread.demo3();
        //ProOfThread.runABCWhenAllReady();
        ProOfThread.doTaskWithResultInWorker();
    }
}
