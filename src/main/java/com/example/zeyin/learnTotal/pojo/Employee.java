package com.example.zeyin.learnTotal.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年02月25日 15:35
 * @Modify:
 */
@Data
@Builder//会覆盖本身的构造方法
@AllArgsConstructor//保留全参构造方法
@NoArgsConstructor//保留无参构造方法
public class Employee {
    private String name;

    private int age;
}
