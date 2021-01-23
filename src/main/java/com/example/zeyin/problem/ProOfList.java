package com.example.zeyin.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月23日 17:06
 * @Modify:
 */
public class ProOfList {

    public void methodOfList(){
        List list = new ArrayList();
        ArrayList arrayList = new ArrayList();
        //list.trimToSize(); //错误，没有该方法。
        arrayList.trimToSize(); //ArrayList里有该方法。
    }
}
