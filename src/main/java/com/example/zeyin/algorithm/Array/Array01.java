package com.example.zeyin.algorithm.Array;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Discription: 数组相关
 * @Author: zeyin
 * @Date: 2020/3/22 12:18
 * @Modified:
 */
public class Array01 {

    /**
     @Description: 数组中重复的数字，找出数组中任意一个重复的数字
     @Author: zeyin
     @Date: 2020/3/22 12:26
     @Param:
     @Return:
     */
    private static ArrayList Desc=new ArrayList();
    public static boolean duplicate(int array1[]) {
        //初始化结果集合
        boolean flag = false;
        int length=array1.length;
        if(length == 0 || array1 == null){
            return flag;
        }
        Arrays.sort(array1);
        for (int i=0;i<=length-2;i++){
            if(array1[i]==array1[i+1]){
                flag=true;
                Desc.add(array1[i]);
                break;
            }
        }
        return flag;
    }

}
