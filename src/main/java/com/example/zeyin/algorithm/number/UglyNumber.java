package com.example.zeyin.algorithm.number;

/**
 * @Description: 丑数
 * @Author: zeyin
 * @Date: 2020年04月01日 21:55:56
 * @Modify:
 */

public class UglyNumber {

    /**
    * @Description: 寻找第N个丑数
    * @Author: zeyin
    * @Date: 2020/4/1 21:56
    * @Modify:
    * @Param:
    * @Return:
    */
    public static Integer getUglyNumber_Solution(Integer pIndex){
        if(pIndex <=0)
            return 0;
        //用空间换时间思想
        int u[]=new int[pIndex];
        u[0]=1;//初始值
        int u2=0,u3=0,u5=0;//2,3,5的个数

        for(int i = 1; i< pIndex; i++) {
            u[i]=Math.min(Math.min(u[u2]*2, u[u3]*3), u[u5]*5);
            while(u[u2]*2<=u[i])
                u2++;
            while(u[u3]*3<=u[i])
                u3++;
            while(u[u5]*5<=u[i])
                u5++;
        }
        return u[pIndex -1];
    }
}
