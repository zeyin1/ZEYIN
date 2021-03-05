package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

/**
 * @Description: 验证二叉搜索树
 *
 * 定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 示例 1:
 *
 * 输入:
 *     2
 *    / \
 *   1   3
 * 输出: true
 *
 * @Author: zeyin
 * @Date: 2020年11月21日 18:28
 * @Modify:
 */
public class leetcode98 {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer lower, Integer upper) {

        //入参检查
        if (root == null) {
            return true;
        }

        //根元素与左侧较小值比较
        if (lower != null && lower >= root.val) {
            return false;
        }
        //根元素与右侧较大值比较
        if (upper != null && upper <= root.val) {
            return false;
        }

        //左子树（较小值、根元素）
        if (!isValidBST(root.left, lower, root.val)) {
            return false;
        }
        //右子树（根元素、较大值）
        if (!isValidBST(root.right, root.val, upper)) {
            return false;
        }

        //二叉搜索树返回true
        return true;
    }
}
