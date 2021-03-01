package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月24日 20:36
 * @Modify:
 */
public class leetcode886 {

    private List<Integer>[] graph;
    private Map<Integer, Integer> color;

    public boolean possibleBipartition(int N, int[][] dislikes) {
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : dislikes) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        color = new HashMap<>();
        for (int node = 1; node <= N; ++node)
            if (!color.containsKey(node) && !dfs(node, 0))
                return false;
        return true;
    }

    //形成循环则false
    public boolean dfs(int node, int c) {
        if (color.containsKey(node))
            return color.get(node) == c;//深度遍历结束
        color.put(node, c);

        for (int nei : graph[node])
            if (!dfs(nei, c ^ 1))//异或，C颜色
                return false;
        return true;
    }
}
