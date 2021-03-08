package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树展开为链表
 *
 *给你二叉树的根结点 root ，请你将它展开为一个单链表：
 *
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 *
 * @Author: zeyin
 * @Date: 2020年11月22日 20:45
 * @Modify:
 */
public class leetcode114 {

    //前序遍历，递归
    private List<TreeNode> list = new ArrayList<>();

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrder(root);

        //构建新的链表
        for (int i = 1; i < list.size(); i++) {
            TreeNode preNode = list.get(i - 1);
            TreeNode curNode = list.get(i);

            preNode.left = null;
            preNode.right = curNode;
        }
    }

    private void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        list.add(root);
        preOrder(root.left);
        preOrder(root.right);
    }


    //方法2
    public void flatten1(TreeNode root) {
        TreeNode curNode = root;
        while (curNode != null) {
            if (curNode.left != null) {

                TreeNode nextNode = curNode.left;
                TreeNode preNode = nextNode;
                while (preNode.right != null) {
                    preNode = preNode.right;
                }

                preNode.right = curNode.right;
                curNode.left = null;
                curNode.right = nextNode;
            }
            curNode = curNode.right;
        }
    }
}
