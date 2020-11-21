package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 17:05
 * @Modify:
 */
public class leetcode236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        //左右子树判定
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);

        if (leftNode != null && rightNode != null) {
            return root;
        }

        if (leftNode != null) {
            return leftNode;
        } else {
            return rightNode;
        }
    }
}
