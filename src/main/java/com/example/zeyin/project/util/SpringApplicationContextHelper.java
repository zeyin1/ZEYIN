package com.example.zeyin.project.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description: 通过上下文加载bean
 * @Author: zeyin
 * @Date: 2020年04月12日 12:12:59
 * @Modify:
 */
@Component
@Slf4j
public class SpringApplicationContextHelper implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("通过上下文加载bean的方法，注入成功");
        context = applicationContext;
    }

    public static <T> T getBean(Class<T> tClass) {
        if (null == context) {
            return null;
        }
        return context.getBean(tClass);
    }
}
