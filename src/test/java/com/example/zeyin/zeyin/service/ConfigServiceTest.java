package com.example.zeyin.zeyin.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: todo 用一句话描述
 * @Author: zeyin
 * @Date: 2020年04月12日 12:05:37
 * @Modify:
 */
@SpringBootTest
public class ConfigServiceTest {

    @Autowired
    private ConfigService configService;

    /**
    * @Description: todo 用一句话描述
    * @Author: zeyin
    * @Date: 2020/4/12 12:07
    * @Modify:
    * @Param:
    * @Return:
    */
    @Test
    public void test1(){
        System.out.println("输出结果："+configService.getUrlInfoByConfig1());
    }
    /**
    * @Description: todo 用一句话描述
    * @Author: zeyin
    * @Date: 2020/4/12 12:07
    * @Modify:
    * @Param:
    * @Return:
    */
    @Test
    public void test2(){
        System.out.println("输出结果："+configService.getUrlInfoByConfig2());
    }
}
