package com.example.zeyin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.zeyin.zeyin.mapper")
public class ZeyinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeyinApplication.class, args);
    }

}
