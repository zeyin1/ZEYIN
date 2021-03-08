package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 加油站
 *
 *在一条环路上有 N 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 *
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
 *
 * 如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1。
 *
 * 说明: 
 *
 * 如果题目有解，该答案即为唯一答案。
 * 输入数组均为非空数组，且长度相同。
 * 输入数组中的元素均为非负数。
 *
 *
 *
 * @Author: zeyin
 * @Date: 2020年11月22日 16:50
 * @Modify:
 */
public class leetcode134 {

    //动态规划
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || cost == null || gas.length == 0 || gas.length != cost.length)
            return -1;

        int start = 0;//开始位置
        int total = 0;//差值（一定非负）
        int sum = 0;//剩余油插值

        for (int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);
            if (sum < 0) {//重置
                sum = gas[i] - cost[i];
                start = i;//重新设置起点
            } else {
                sum += (gas[i] - cost[i]);//更新油箱中油数
            }
        }
        return total >= 0 ? start : -1;
    }
}
