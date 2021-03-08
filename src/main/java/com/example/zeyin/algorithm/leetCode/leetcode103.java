package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

import java.util.*;

/**
 * @Description: 二叉树的锯齿形层序遍历
 *
 *给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 *
 * 方法：
 * 1、用一个大队列存储
 * 2、单层用list存储，双层用stack存储
 *
 * @Author: zeyin
 * @Date: 2020年11月21日 14:27
 * @Modify:
 */
public class leetcode103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean isDir = true;//是否为奇数层
        while (!queue.isEmpty()) {
            int len = queue.size();

            //右边到左边，用栈
            Stack<Integer> stack = new Stack<>();
            //左边到右边，用链表
            List<Integer> list = new ArrayList<>();

            //存储下一层的元素
            for (int i = 0; i < len; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }

                //取出元素
                int val = queue.poll().val;
                if (isDir) {
                    list.add(val);
                } else {
                    stack.push(val);
                }
            }

            //加入结果集合
            if (isDir) {
                resList.add(list);//奇数层
            } else {
                //偶数层
                List<Integer> tmpList = new ArrayList<>();
                while (!stack.isEmpty()) {
                    tmpList.add(stack.pop());
                }
                resList.add(tmpList);
            }

            isDir = !isDir;//改变层级
        }

        return resList;
    }
}
