package com.example.zeyin.project.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description: 通过Value注解配置
 * @Author: zeyin
 * @Date: 2020年04月12日 11:15:19
 * @Modify:
 */
@Data
@Component
@ConfigurationProperties()
public class Config1 {
    /**
     * IP地址
     */
    @Value("${cnf.ip}")
    private String ip;
    /**
     * 端口
     */
    @Value("${cnf.port}")
    private String port;

    /**
     * 域名
     */
    @Value("${cnf.url}")
    private String url;

    public String getUrlInfo() {
        return "http://" + ip + ":" + port + "/" + url;
    }

}
