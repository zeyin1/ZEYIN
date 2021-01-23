package com.example.zeyin.problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月23日 17:26
 * @Modify:
 */
public class ProOfSet {

    public static void methodOfSet() {
        Set set = new HashSet();
        set.add("tracy");
        set.add("hcx");
        set.add(123);
        set.add(4.5);
        System.out.println(set);//[4.5, hcx, tracy, 123]
        //第一种方法
        if (!set.isEmpty()) {
            System.out.println(set.iterator().next());// 4.5
        }
        //第二种方法:将set集合转换成list集合 取第一个
        List list = new ArrayList(set);
        System.out.println(list.get(0));// 4.5
    }
}
