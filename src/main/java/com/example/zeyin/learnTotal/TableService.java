package com.example.zeyin.learnTotal;

import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年02月25日 15:26
 * @Modify:
 */
public interface TableService {

    void chkTable();

    <T, Z> List<Z> getNameList(Class<T> tClass, Class<Z> zClass);
}
