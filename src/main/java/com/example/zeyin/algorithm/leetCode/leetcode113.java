package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Description: 路径总和II
 *
 *给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 * 叶子节点 是指没有子节点的节点。
 * @Author: zeyin
 * @Date: 2020年11月21日 21:07
 * @Modify:
 */
public class leetcode113 {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        Deque<Integer> path = new ArrayDeque<>();
        pathSum(root, sum, path);
        return res;
    }

    private void pathSum(TreeNode root, int sum, Deque<Integer> path) {
        if (root == null) {
            return;
        }
        sum = sum - root.val;
        path.addLast(root.val);

        if (sum == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(path));
            path.removeLast();
            return;
        }

        //左右子树
        pathSum(root.left, sum, path);
        pathSum(root.right, sum, path);
        path.removeLast();
    }

}
