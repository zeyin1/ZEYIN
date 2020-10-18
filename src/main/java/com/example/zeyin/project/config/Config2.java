package com.example.zeyin.project.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description: 通过前缀配置
 * @Author: zeyin
 * @Date: 2020年04月12日 11:15:19
 * @Modify:
 */
@Data
@Component
@ConfigurationProperties(prefix = "cnf")
public class Config2 {
    /**
     * IP地址
     */
    private String ip;
    /**
     * 端口
     */
    private String port;

    /**
     * url
     */
    private String url;

    public String getUrlInfo(){
        return "http://"+ip+":"+port+"/"+url;
    }
}
