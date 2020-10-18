package com.example.zeyin.project.abst.service;

/**
 * @Description: todo 用一句话描述
 * @Author: zeyin
 * @Date: 2020年04月12日 16:54:21
 * @Modify:
 */

public abstract class Abst {
    /**
    * @Description: 抽象方法
    * @Author: zeyin
    * @Date: 2020/4/12 16:55
    * @Modify:
    * @Param:
    * @Return:
    */

    public abstract void abst();

    /**
    * @Description: todo 用一句话描述
    * @Author: zeyin
    * @Date: 2020/4/12 16:55
    * @Modify:
    * @Param:
    * @Return:
    */
    public void abstImpl(){
        System.out.println("执行抽象类的抽象方法");
        this.abst();
        System.out.println("执行抽象类的实例方法");
    }
}
