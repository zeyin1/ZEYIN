package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 11:50
 * @Modify:
 */
public class leetcode102 {

    private static List<List<Integer>> res=new ArrayList<>();
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null){
            return res;
        }

        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);

        //层次循环
        while (!queue.isEmpty()){
            int len=queue.size();
            List<Integer> list=new ArrayList<>();//单层元素
            for (int i=0;i<len;i++){
                TreeNode node=queue.poll();
                list.add(node.val);

                if (node.left!=null){
                    queue.add(root.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
