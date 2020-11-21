package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 21:00
 * @Modify:
 */
public class leetcode144 {

    private List<Integer> res=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return res;
    }

    private void preOrder(TreeNode root){
        if (root==null){
            return;
        }
        res.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
