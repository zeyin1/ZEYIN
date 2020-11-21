package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 18:28
 * @Modify:
 */
public class leetcode98 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer lower, Integer upper) {
        if (root == null) {
            return true;
        }

        //根元素
        if (lower != null && lower >= root.val) {
            return false;
        }
        if (upper != null && upper <= root.val) {
            return false;
        }

        //左子树
        if (!isValidBST(root.left, lower, root.val)) {
            return false;
        }

        //右子树
        if (!isValidBST(root.right, root.val, upper)) {
            return false;
        }
        return true;
    }
}
