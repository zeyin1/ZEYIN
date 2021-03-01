package com.example.zeyin.project.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年04月12日 17:19:36
 * @Modify:
 */
@SpringBootTest
public class GetAbstServicetest {
    @Autowired
    private GetAbstService getAbstService;

    /**
     * @Description: 用一句话描述
     * @Author: zeyin
     * @Date: 2020/4/19 10:29
     */
    @Test
    public void test1() {
        getAbstService.getAbstService();
    }
}
