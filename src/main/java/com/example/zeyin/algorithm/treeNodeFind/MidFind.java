package com.example.zeyin.algorithm.treeNodeFind;

import com.example.zeyin.util.TreeNode;

import java.util.List;
import java.util.Stack;

/**
 * @Description: 中序遍历
 * @Author: zeyin
 * @Date: 2020年11月19日 20:01
 * @Modify:
 */
public class MidFind {

    /**
     * 递归
     */
    private static List<TreeNode> list;

    public static void midFind(TreeNode root) {
        midFind(root.left);
        list.add(root);
        midFind(root.right);
    }

    /**
     * 非递归
     */
    private static List<TreeNode> list1;

    public static void midFind1(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            if (!stack.isEmpty()) {
                node = stack.pop();
                list1.add(node);
                node = node.right;
            }
        }

    }
}
