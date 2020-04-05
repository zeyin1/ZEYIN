package com.example.zeyin.zeyin.mapper;

import com.example.zeyin.zeyin.pojo.RamMidStu;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 数据实体Mapper
 * @Author: zeyin
 * @Date: 2020年03月29日 23:13:32
 * @Modify:
 */
@Mapper
public interface RamMidStuMapper {

    /**
     * @Description: 查询数据
     * @Author: zeyin
     * @Date: 2020/3/29 23:14
     * @Modify:
     * @Param:
     * @Return:
     */
    RamMidStu qryRamMidStuByStuNam(@Param("stuNam") String stuNam);
}
