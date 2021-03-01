package com.example.zeyin.project.transaction;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: todo 用一句话描述
 * @Author: zeyin
 * @Date: 2020年04月12日 17:47:37
 * @Modify:
 */
@Service
public class TxServiceImpl implements TxService {
    /**
     * @Description: 用注解实现方法的独立子事务
     * @Author: zeyin
     * @Date: 2020/4/12 17:47
     * @Modify:
     * @Param:
     * @Return:
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void txServiceMethod() {
        System.out.println("用注解方式实现独立子事务");
    }
}
