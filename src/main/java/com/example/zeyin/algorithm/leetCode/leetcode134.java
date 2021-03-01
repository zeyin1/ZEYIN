package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
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
