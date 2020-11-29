package com.example.zeyin.util;

/**
 * @Description: 并查集
 * @Author: zeyin
 * @Date: 2020年11月29日 13:40
 * @Modify:
 */
public class DSU {
    public int[] parent;

    public DSU(int len) {
        parent = new int[len];
        for (int i = 0; i < len; ++i)
            parent[i] = i;
    }

    public int find(int x) {
        return parent[x] != x ? parent[x] = find(parent[x]) : x;
    }

    //构成互通的链表
    public void union(int x, int y) {
        parent[find(x)] = find(y);
    }
}
