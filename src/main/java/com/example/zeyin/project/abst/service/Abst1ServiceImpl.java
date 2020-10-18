package com.example.zeyin.project.abst.service;

import com.example.zeyin.project.abst.AbstService;
import org.springframework.stereotype.Service;

/**
 * @Description: todo 用一句话描述
 * @Author: zeyin
 * @Date: 2020年04月12日 16:59:41
 * @Modify:
 */
@Service("Abst1ServiceImpl")
public class Abst1ServiceImpl implements AbstService {

    @Override
    public void abstServiceMethod() {
        System.out.println("创建抽象类对象");
        Abst abst=new Abst() {
            @Override
            public void abst() {
                System.out.println("实现抽象类的抽象方法");
            }
        };
        abst.abstImpl();
    }
}
