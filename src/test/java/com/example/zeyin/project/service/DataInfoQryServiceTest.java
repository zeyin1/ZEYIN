package com.example.zeyin.project.service;

import com.example.zeyin.project.mapper.RamMidStuMapper;
import com.example.zeyin.project.pojo.RamMidStu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 测试类
 * @Author: zeyin
 * @Date: 2020年04月01日 20:53:43
 * @Modify:
 */
@SpringBootTest
public class DataInfoQryServiceTest {

    @Autowired
    private DataInfoQryService mDataInfoQryService;

    @Autowired
    private RamMidStuMapper mRamMidStuMapper;

    /**
     * @Description: 测试一
     * @Author: zeyin
     * @Date: 2020/4/1 20:55
     * @Modify:
     * @Param:
     * @Return:
     */
    @Test
    public void test() {
        String stuNam = "张三";
        RamMidStu ramMidStu = mDataInfoQryService.qryDataInfo(stuNam);
        System.out.println(ramMidStu);
    }
}
