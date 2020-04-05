package com.example.zeyin.zeyin.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description: 测试数据表的实体类
 * @Author: zeyin
 * @Date: 2020年03月29日 22:58:09
 * @Modify:
 */
@Data
public class RamMidStu {
    /**
     * 姓名
     */
    private String stuNam;
    /**
     * 学号
     */
    private String stuNum;
    /**
     * 分数
     */
    private BigDecimal stuSco;
    /**
     * 学科
     */
    private String stuSub;
    /**
     * 性别
     */
    private String stuSex;
}
