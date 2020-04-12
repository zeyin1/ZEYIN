package com.example.zeyin.zeyin.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: todo 用一句话描述
 * @Author: zeyin
 * @Date: 2020年04月12日 17:19:36
 * @Modify:
 */
@SpringBootTest
public class GetAbstServicetest {
    @Autowired
    private GetAbstService getAbstService;
    /**
    * @Description: todo 用一句话描述
    * @Author: zeyin
    * @Date: 2020/4/12 17:23
    * @Modify:
    * @Param: 
    * @Return: 
    */
    @Test
    public void test1(){
        getAbstService.getAbstService();
    }
}
