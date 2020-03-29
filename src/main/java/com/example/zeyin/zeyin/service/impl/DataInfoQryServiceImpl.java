package com.example.zeyin.zeyin.service.impl;

import com.example.zeyin.zeyin.mapper.RamZeyIntMapper;
import com.example.zeyin.zeyin.pojo.RamZeyInt;
import com.example.zeyin.zeyin.service.DataInfoQryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 测试实现类
 * @Author: zeyin
 * @Date: 2020年03月29日 23:05:22
 * @Modify:
 */
@Service
public class DataInfoQryServiceImpl implements DataInfoQryService {

    @Autowired
    private RamZeyIntMapper mRamZeyIntMapper;
    /**
    * @Description: 测试实现类
    * @Author: zeyin
    * @Date: 2020/3/29 23:05
    * @Modify:
    * @Param:
    * @Return:
    */
    @Override
    public RamZeyInt qryDataInfo(String test1) {
        return mRamZeyIntMapper.qryRamZeyIntByTest1(test1);
    }
}
