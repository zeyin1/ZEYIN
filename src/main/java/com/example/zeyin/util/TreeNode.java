package com.example.zeyin.util;

import lombok.Data;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年08月09日 10:49
 * @Modify:
 */
@Data
public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int val;

    public TreeNode(int x) {
        x = val;
    }
}
