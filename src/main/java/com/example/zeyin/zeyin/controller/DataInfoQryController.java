package com.example.zeyin.zeyin.controller;

import com.example.zeyin.zeyin.errorcode.ErrorEnum;
import com.example.zeyin.zeyin.pojo.RamMidStu;
import com.example.zeyin.zeyin.service.DataInfoQryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 查询数据库数据
 * @Author: zeyin
 * @Date: 2020年03月29日 22:54:41
 * @Modify:
 */
@RestController
public class DataInfoQryController {

    @Autowired
    private DataInfoQryService mDataInfoQryService;

    /**
    * @Description: 查询数据库数据
    * @Author: zeyin
    * @Date: 2020/3/29 22:55
    * @Modify:
    * @Param:
    * @Return:
    */
    @RequestMapping("qryDataInfo")
    public RamMidStu qryDataInfo(String pStuNam) throws Exception {
        if (StringUtils.isEmpty(pStuNam)){
            throw new Exception(ErrorEnum.ERR001.getCode());
        }

        RamMidStu wRamMidStu =mDataInfoQryService.qryDataInfo(pStuNam);
        if (wRamMidStu ==null){
            throw new Exception(ErrorEnum.ERR002.getCode());
        }
        return wRamMidStu;
    }
}
