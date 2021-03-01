package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年12月05日 20:25
 * @Modify:
 */
public class leetcode222 {

    // 获取左子树的高度(其实是最左侧分支）
    public int getLeftHeight(TreeNode root) {
        int count = 0;
        while (root != null) {
            count++;
            root = root.left;
        }
        return count;
    }

    // 获取右子树的高度（其实是最右侧分支的高度）
    public int getRightHeight(TreeNode root) {
        int count = 0;
        while (root != null) {
            count++;
            root = root.right;
        }
        return count;
    }

    /**
     * （1）左子树高度==右子树高度，节点数=2*高度数-1；
     * （2）反之，左子树节点数+右子树节点数+1
     *
     * @param root
     * @return
     */
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);

        if (leftHeight == rightHeight) {
            // 表示是满二叉树，二叉树的节点数直接由公式2^n-1得到
            // leftHeight即为层数， 1 << leftHeight使用位运算计算2^leftHeight，效率更高
            // 注意(1 << leftHeight) - 1 的括号必须有！！
            return (1 << leftHeight) - 1;
        } else {
            // 若该二叉树不是满二叉树，递归的调用该方法，计算左子树和右子树的节点数
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }
}
