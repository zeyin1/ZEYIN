package com.example.zeyin.learnTotal.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年02月25日 15:22
 * @Modify:
 */
@Mapper
public interface TableMapper {
    /**
     * @Description: 用一句话描述
     * 1、单个入参，可以省略@Param
     * 2、多个入参，必须使用@Param注解
     * @Author: zeyin
     * @Date: 2021/2/25 15:22
     */
    void chkTable(@Param("value") String value);
}
