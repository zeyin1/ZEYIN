package com.example.zeyin.algorithm.treeNodeFind;

import com.example.zeyin.util.TreeNode;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * @Description: 层次遍历
 * @Author: zeyin
 * @Date: 2020年11月19日 20:02
 * @Modify:
 */
public class BfsFind {

    /**
     * 层次遍历用队列实现
     */

    private static List<TreeNode> list;

    public static void bfsFind(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

        }

    }
}
