package com.example.zeyin.algorithm.leetCode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description: 用一句话描述
 *
设计和构建一个“最近最少使用”缓存，该缓存会删除最近最少使用的项目。缓存应该从键映射到值(允许你插入和检索特定键对应的值)，并在初始化时指定最大容量。当缓存被填满时，它应该删除最近最少使用的项目。

它应该支持以下操作： 获取数据 get 和 写入数据 put 。

获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
写入数据 put(key, value) - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，它应该在写入新数据之前删除最近最少使用的数据值，从而为新的数据值留出空间。
 * @Author: zeyin
 * @Date: 2020年10月18日 15:15
 * @Modify:
 */
public class LRUCache {

    Map<Integer,Integer> cache = null;

    // 这个是匿名内部类
    // LinkedHashMap的三个构造函数分别是初始容量，扩容因子和是否移除旧的元素
    public LRUCache(int capacity) {
        cache = new LinkedHashMap<Integer, Integer>(capacity,0.75f,true){
            // 必须覆盖该方法来保证移除旧的元素
            // 返回false，不删除
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                if(this.size() > capacity){
                    return true;
                }
                return false;
            }
        };
    }

    public int get(int key) {
        Integer v = this.cache.get(key);
        return v==null?-1:v.intValue();
    }

    public void put(int key, int value) {
        this.cache.put(key,value);
    }
}
