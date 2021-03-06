package com.example.zeyin.util;

import lombok.Data;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年12月13日 15:45
 * @Modify:
 */
@Data
public class TreeLinkNode {
    public int val;
    public TreeLinkNode left = null;
    public TreeLinkNode right = null;
    public TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
