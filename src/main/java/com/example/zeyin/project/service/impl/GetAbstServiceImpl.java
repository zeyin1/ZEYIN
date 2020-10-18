package com.example.zeyin.project.service.impl;

import com.example.zeyin.project.abst.AbstService;
import com.example.zeyin.project.service.GetAbstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: todo 用一句话描述
 * @Author: zeyin
 * @Date: 2020年04月12日 17:16:59
 * @Modify:
 */
@Service
public class GetAbstServiceImpl implements GetAbstService {
    @Autowired
    private AbstService abstService;

    @Override
    public void getAbstService() {
        abstService.abstServiceMethod();
    }
}
