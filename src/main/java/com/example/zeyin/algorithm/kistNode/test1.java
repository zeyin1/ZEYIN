package com.example.zeyin.algorithm.kistNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年09月17日 22:36
 * @Modify:
 */
public class test1 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adjacency = new ArrayList<>();//N门课程所依赖

        for (int i = 0; i < numCourses; i++)
            adjacency.add(new ArrayList<>());

        int[] flags = new int[numCourses];//学习情况

        for (int[] cp : prerequisites)
            adjacency.get(cp[1]).add(cp[0]);

        for (int i = 0; i < numCourses; i++)
            if (!dfs(adjacency, flags, i)) return false;

        return true;
    }

    private boolean dfs(List<List<Integer>> adjacency, int[] flags, int i) {

        if (flags[i] == 1) return false;
        if (flags[i] == -1) return true;

        flags[i] = 1;//已经学习
        for (Integer j : adjacency.get(i))
            if (!dfs(adjacency, flags, j)) return false;

        flags[i] = -1;//已经学习
        return true;
    }
}
