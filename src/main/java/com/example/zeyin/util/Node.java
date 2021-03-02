package com.example.zeyin.util;

import lombok.Data;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年03月02日 10:57
 * @Modify:
 */
@Data
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

}
