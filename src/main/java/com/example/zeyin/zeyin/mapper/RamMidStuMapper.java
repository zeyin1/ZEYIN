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
     * @Description: 根据学生姓名查询学生信息
     * @Author: zeyin
     * @Date: 2020/4/5 13:52
     * @Modify:
     * @Param:
     * @Return:
     */

    RamMidStu getRamMidStuInfo(@Param("pStuNam") String pStuNam);

    /**
     * @Description: 查询学生分数
     * @Author: zeyin
     * @Date: 2020/4/5 14:23
     * @Modify:
     * @Param:
     * @Return:
     */
    String getStudentScore(@Param("pStuNam") String pStuNam);
}
