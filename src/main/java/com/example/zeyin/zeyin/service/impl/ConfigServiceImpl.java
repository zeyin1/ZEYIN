package com.example.zeyin.zeyin.service.impl;

import com.example.zeyin.util.SpringApplicationContextHelper;
import com.example.zeyin.zeyin.config.Config1;
import com.example.zeyin.zeyin.config.Config2;
import com.example.zeyin.zeyin.abst.AbstService;
import com.example.zeyin.zeyin.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: todo 用一句话描述
 * @Author: zeyin
 * @Date: 2020年04月12日 11:57:45
 * @Modify:
 */
@Service
public class ConfigServiceImpl implements ConfigService {

    /**
    * @Description: todo 用一句话描述
    * @Author: zeyin
    * @Date: 2020/4/12 12:06
    * @Modify:
    * @Param: 
    * @Return: 
    */
    @Override
    public String getUrlInfoByConfig1() {
        return SpringApplicationContextHelper.getBean(Config1.class).getUrlInfo();
    }

    /**
     * @Description: todo 用一句话描述
     * @Author: zeyin
     * @Date: 2020/4/12 12:21
     * @Modify:
     * @Param:
     * @Return:
     */
    @Override
    public String getUrlInfoByConfig2(){
        return SpringApplicationContextHelper.getBean(Config2.class).getUrlInfo();
    }

}
