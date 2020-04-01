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
public class RamZeyIntMapperImpl implements RamZeyIntMapper {

    /**
     * @Description: 查询数据
     * @Author: zeyin
     * @Date: 2020/3/29 23:14
     * @Modify:
     * @Param:
     * @Return:
     */
    @Override
    public RamZeyInt qryRamZeyIntByTest1(String pTest1) {
        return new RamZeyInt();
    }
}
