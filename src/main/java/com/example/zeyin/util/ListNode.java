package com.example.zeyin.util;

import lombok.Data;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年05月11日 22:24
 * @Modify:
 */
@Data
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
}