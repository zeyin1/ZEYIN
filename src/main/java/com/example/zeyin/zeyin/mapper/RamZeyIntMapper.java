package com.example.zeyin.zeyin.mapper;

import com.example.zeyin.zeyin.pojo.RamZeyInt;

import org.springframework.stereotype.Service;

/**
 * @Description: 数据实体Mapper
 * @Author: zeyin
 * @Date: 2020年03月29日 23:13:32
 * @Modify:
 */
@Service
public interface RamZeyIntMapper {

    /**
     * @Description: 查询数据
     * @Author: zeyin
     * @Date: 2020/3/29 23:14
     * @Modify:
     * @Param:
     * @Return:
     */
    RamZeyInt qryRamZeyIntByTest1(String pTest1);
}
