package com.example.zeyin.algorithm.treeNodeFind;

import com.example.zeyin.util.TreeNode;

import java.util.List;
import java.util.Stack;

/**
 * @Description: 前序遍历
 * @Author: zeyin
 * @Date: 2020年11月19日 20:00
 * @Modify:
 */
public class PreFind {
    /**
     * 递归
     */
    private static List<TreeNode> list;

    public static void preFind(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root);
        preFind(root.left);
        preFind(root.right);
    }

    /**
     * 非递归
     */
    private static List<TreeNode> list1;

    public static void preFind1(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();//存储父节点
        TreeNode node = root;

        while (!stack.isEmpty() || node != null) {
            //走到最左边
            while (node != null) {
                list1.add(node);
                stack.push(node);//存储父节点
                node = node.left;//左节点
            }

            if (!stack.isEmpty()) {
                node = stack.pop();
                node = node.right;//遍历父节点的右节点
            }
        }
    }
}
