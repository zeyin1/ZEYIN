package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的中序遍历
 * @Author: zeyin
 * @Date: 2020年11月21日 14:44
 * @Modify:
 */
public class leetcode94 {

    /**
     * 递归实现
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        midFind(root, res);
        return res;
    }

    private void midFind(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            midFind(root.left, res);
        }

        res.add(root.val);

        if (root.right != null) {
            midFind(root.right, res);
        }
    }
}
