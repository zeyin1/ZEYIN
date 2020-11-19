package com.example.zeyin.algorithm.treeNodeFind;

import com.example.zeyin.util.TreeNode;

import java.util.List;
import java.util.Stack;

/**
 * @Description: 后序遍历
 * @Author: zeyin
 * @Date: 2020年11月19日 20:01
 * @Modify:
 */
public class PostFind {
    /**
     * 递归
     */
    private static List<TreeNode> list;

    public static void postFind(TreeNode root) {
        postFind(root.left);
        postFind(root.right);
        list.add(root);
    }

    /**
     * 非递归
     */
    private static List<TreeNode> list1;

    public static void postFind1(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();

        TreeNode curNode = root;//当前节点
        TreeNode lastNode = null;//上次访问节点

        //节点移到左子树的最下边
        while (curNode != null) {
            stack.push(curNode);
            curNode = curNode.left;
        }

        //栈元素非空
        while (!stack.isEmpty()) {
            curNode = stack.pop();

            //一个根节点被访问的前提是：没有右子树，或右子树已经访问了
            //不能访问根节点（条件取反）
            if (curNode.right != null && curNode.right != lastNode) {
                stack.push(curNode);
                curNode = curNode.right;
                //到右子树
                while (curNode != null) {
                    //继续到右子树的左节点上
                    stack.push(curNode);
                    curNode = curNode.left;
                }
            } else {
                //访问根节点
                list1.add(curNode);
                lastNode = curNode;//更新上次访问的节点
            }
        }
    }
}
