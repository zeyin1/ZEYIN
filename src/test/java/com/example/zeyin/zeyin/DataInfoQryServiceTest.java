package com.example.zeyin.zeyin;

import com.example.zeyin.zeyin.pojo.RamMidStu;
import com.example.zeyin.zeyin.service.DataInfoQryService;
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

    /**
    * @Description: 测试一
    * @Author: zeyin
    * @Date: 2020/4/1 20:55
    * @Modify:
    * @Param:
    * @Return:
    */
    @Test
    public void test(){
        String stuNam="zeyin1";
        RamMidStu ramMidStu =mDataInfoQryService.qryDataInfo(stuNam);
        System.out.println(ramMidStu);
    }
}
