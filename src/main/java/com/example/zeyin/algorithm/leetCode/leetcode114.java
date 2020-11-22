package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月22日 20:45
 * @Modify:
 */
public class leetcode114 {

    //前序遍历，递归
    private List<TreeNode> list=new ArrayList<>();
    public void flatten(TreeNode root) {
        if (root==null){
            return;
        }
        preOrder(root);

        //构建新的链表
        for (int i=1;i<list.size();i++){
            TreeNode preNode=list.get(i-1);
            TreeNode curNode=list.get(i);

            preNode.left=null;
            preNode.right=curNode;
        }
    }

    private void preOrder(TreeNode root){
        if (root==null){
            return;
        }

        list.add(root);
        preOrder(root.left);
        preOrder(root.right);
    }


    //方法2
    public void flatten1(TreeNode root) {
        TreeNode curNode=root;
        while (curNode!=null){
            if (curNode.left!=null){

            TreeNode nextNode=curNode.left;
            TreeNode preNode=nextNode;
            while (preNode.right!=null){
                preNode=preNode.right;
            }

            preNode.right=curNode.right;
            curNode.left=null;
            curNode.right=nextNode;
            }
            curNode=curNode.right;
        }
    }
}
