package com.example.zeyin.zeyin.service.impl;

import com.example.zeyin.zeyin.mapper.RamMidStuMapper;
import com.example.zeyin.zeyin.pojo.RamMidStu;
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
    private RamMidStuMapper mRamMidStuMapper;
    /**
    * @Description: 测试实现类
    * @Author: zeyin
    * @Date: 2020/3/29 23:05
    * @Modify:
    * @Param:
    * @Return:
    */
    @Override
    public RamMidStu qryDataInfo(String pStuNam) {
        return mRamMidStuMapper.getRamMidStuInfo(pStuNam);
    }
}
