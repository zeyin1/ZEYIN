package com.example.zeyin.learnTotal.controller;

import com.example.zeyin.learnTotal.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年02月25日 15:29
 * @Modify:
 */
@RestController
public class TableController {

    @Autowired
    private TableService tableService;

    @PostMapping("aaa/bbb")
    public void chkController() {
        tableService.chkTable();
    }
}
