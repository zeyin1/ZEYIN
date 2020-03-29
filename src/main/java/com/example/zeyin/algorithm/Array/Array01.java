package com.example.zeyin.algorithm.Array;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Discription: 数组中重复的数字，找出数组中任意一个重复的数字
 * @Author: zeyin
 * @Date: 2020/3/22 12:18
 * @Modified:
 */
public class Array01 {

    /**
     @Description: 方法1-利用ArrayList自带的sort方法
     @Author: zeyin
     @Date: 2020/3/22 12:26
     @Param:
     @Return:
     */
    private static ArrayList Desc=new ArrayList();
    public static boolean duplicate01(int array1[]) {
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

    /**
    * @Description: 方法二-利用容器的特性,返回所有的重复数字(结果元素不重复)
    * @Author: zeyin
    * @Date: 2020/3/29 15:41
    * @Modify:
    * @Param:
    * @Return:
    */
    public static List<Integer> duplicate02(int array1[]) {
        //初始化结果集合
        ArrayList wArrayReturn=new ArrayList();
        int length=array1.length;
        if(length == 0 || array1 == null){
            return wArrayReturn;
        }

        ArrayList wArrayList=new ArrayList();
        for (int i=0;i<=length-1;i++){
            Integer wNum=array1[i];
            if(wArrayList.contains(wNum)){
                //返回结果中不存在该元素，则加入返回结果集合
                if(!wArrayReturn.contains(wNum)){
                    wArrayReturn.add(wNum);
                }
            }else {
                wArrayList.add(wNum);
            }
        }
        return wArrayReturn;
    }

}
