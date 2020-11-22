package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 21:07
 * @Modify:
 */
public class leetcode113 {

    private List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        Deque<Integer> path=new ArrayDeque<>();
        pathSum(root,sum,path);
        return res;
    }

    private void pathSum(TreeNode root,int sum,Deque<Integer> path){
        if (root==null){
            return;
        }
        sum=sum-root.val;
        path.addLast(root.val);

        if (sum==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<>(path));
            path.removeLast();
            return;
        }

        //左右子树
        pathSum(root.left,sum,path);
        pathSum(root.right,sum,path);
        path.removeLast();
    }

}
