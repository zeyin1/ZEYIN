package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的右视图
 *
 * 给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 *
 * @Author: zeyin
 * @Date: 2020年11月21日 10:34
 * @Modify:
 */
public class leetcode199 {

    private static List<TreeNode> res = new ArrayList<>();

    public static List<TreeNode> rightSideView(TreeNode root) {

        dfs(root, 0);

        return res;
    }

    private static void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        //根
        if (depth == res.size()) {
            res.add(root);
        }

        //返回不了，第一次相等使用
        depth++;

        //从右边到左
        //右子树
        dfs(root.right, depth);
        //左子树
        dfs(root.left, depth);
    }
}
