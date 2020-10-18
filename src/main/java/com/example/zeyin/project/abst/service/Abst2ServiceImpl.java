package com.example.zeyin.project.abst.service;

import com.example.zeyin.project.abst.AbstService;
import org.springframework.stereotype.Service;

/**
 * @Description: todo 用一句话描述
 * @Author: zeyin
 * @Date: 2020年04月12日 17:00:10
 * @Modify:
 */
@Service("abstService")
public class Abst2ServiceImpl implements AbstService {
    /**
    * @Description: todo 用一句话描述
    * @Author: zeyin
    * @Date: 2020/4/12 17:14
    * @Modify:
    * @Param: 
    * @Return: 
    */
    @Override
    public void abstServiceMethod() {
        System.out.println("@Service(abstService)，根据service的值获取对应的实现类");
    }
}
