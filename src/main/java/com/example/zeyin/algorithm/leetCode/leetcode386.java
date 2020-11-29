package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 11:43
 * @Modify:
 */
public class leetcode386 {

    private ArrayList<Integer> res = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        for (int i = 1; i < 10; i ++){
            dfs(n, i);
        }
        return res;
    }
    private void dfs(int n, int cur){
        if (cur > n) return;
        res.add(cur);
        for (int i = 0; i < 10; i ++) {
            dfs(n, cur * 10 + i);
        }
    }
}
