package com.example.zeyin.algorithm.Array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Discription: 数组测试类
 * @Author: zeyin
 * @Date: 2020/3/22 12:27
 * @Modified:
 */
@SpringBootTest
@Slf4j
public class ArrayTest {

    /**
     * @Description: 数组测试
     * @Author: zeyin
     * @Date: 2020/3/22 12:28
     * @Param:
     * @Return:
     */
    @Test
    public void ArrayTest() {
        Array wArray = new Array();
        wArray.Array1();
        log.info("日志打印成功");
    }
}
