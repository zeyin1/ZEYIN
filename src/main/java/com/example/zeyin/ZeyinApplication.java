package com.example.zeyin;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.zeyin.zeyin", annotationClass = Mapper.class)
public class ZeyinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeyinApplication.class, args);
    }

}
