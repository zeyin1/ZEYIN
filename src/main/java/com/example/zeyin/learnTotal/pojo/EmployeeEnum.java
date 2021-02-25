package com.example.zeyin.learnTotal.pojo;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年02月25日 15:44
 * @Modify:
 */
public enum EmployeeEnum {
    Name1("张三",14),
    Name2("李四",15),
    Name3("王五",20)
    //////////////////////////////////////////////
    ;
    private String name;
    private int age;

    EmployeeEnum(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }


}
