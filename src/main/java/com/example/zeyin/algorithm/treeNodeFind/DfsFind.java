package com.example.zeyin.algorithm.treeNodeFind;

import com.example.zeyin.util.TreeNode;

import java.util.List;
import java.util.Stack;

/**
 * @Description: 深度遍历
 * @Author: zeyin
 * @Date: 2020年11月19日 20:02
 * @Modify:
 */
public class DfsFind {
    /**
     * 深度优先搜索用栈实现，先加右子树入栈，其次左子树入栈
     */
    private static List<TreeNode> list;

    public static void dfsFind(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node);

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }

        }
    }

}
