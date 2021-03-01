package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
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

        //右子树
        depth++;
        dfs(root.right, depth);

        //左子树
        dfs(root.left, depth);
    }
}
