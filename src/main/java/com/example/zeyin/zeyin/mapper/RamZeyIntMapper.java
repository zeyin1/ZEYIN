package com.example.zeyin.zeyin.mapper;

import com.example.zeyin.zeyin.pojo.RamZeyInt;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @Description: 数据实体Mapper
 * @Author: zeyin
 * @Date: 2020年03月29日 23:13:32
 * @Modify:
 */
@Component
public interface RamZeyIntMapper {

    /**
     * @Description: 查询数据
     * @Author: zeyin
     * @Date: 2020/3/29 23:14
     * @Modify:
     * @Param:
     * @Return:
     */
    RamZeyInt qryRamZeyIntByTest1(@Param("pTest1") String pTest1);
}
