package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月24日 21:02
 * @Modify:
 */
public class leetcode681 {


    //后向遍历数组，找到比它的元素，符合时间规则
    private int bestTime;
    public String nextClosestTime(String time) {
        // write your code here
        char tTime[] = time.toCharArray();
        int[] number = new int[]{tTime[0]-'0', tTime[1]-'0', tTime[3]-'0', tTime[4]-'0'};
        int[] currTime = new int[4];
        int hour = number[0]*10 + number[1];
        int minute = number[2]*10 + number[3];
        int times = toMinute(hour, minute);
        bestTime = times;
        dfs(number, currTime, 0, times);
        String res = String.format("%02d:%02d", bestTime/60, bestTime%60);
        return res;
    }
    public void dfs(int[] number, int[] currTime, int deep, int times){
        if(deep == 4){
            if(currTime[0]*10+currTime[1] > 23 || currTime[2]*10+currTime[3] > 59)
                return;
            int currMinutes = toMinute(currTime[0]*10+currTime[1], currTime[2]*10+currTime[3]);
            if(diff(times, currMinutes) < diff(times, bestTime)){
                bestTime = currMinutes;
            }
            return;
        }
        for(int i = 0; i < 4; ++i){
            currTime[deep] = number[i];
            dfs(number, currTime, deep+1, times);
        }
        return;
    }
    public int toMinute(int hour, int minute){
        return hour*60 + minute;
    }
    public int diff(int time1, int time2){
        if(time1 == time2)
            return 1440;
        return ((1440 - time1) + time2) % 1440;
    }
}
