package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 14:44
 * @Modify:
 */
public class leetcode94 {
    private List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        midFind(root);
        return res;
    }

    private void midFind(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left!=null){
            midFind(root.left);
        }

        res.add(root.val);

        if (root.right!=null){
            midFind(root.right);
        }
    }
}
