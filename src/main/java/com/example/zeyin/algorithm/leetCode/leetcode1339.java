package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 15:42
 * @Modify:
 */
public class leetcode1339 {

    double ans = Double.MIN_VALUE;
    double allSum;
    double nodeSum;
    public int maxProduct(TreeNode root) {
        allSum = sum(root);
        dfs(root);
        return (int)(ans % (int)(1e9 + 7));
    }

    public double sum(TreeNode node){
        if(node == null) return 0;
        return node.val + sum(node.left) + sum(node.right);
    }

    public double dfs(TreeNode node){
        if(node == null)    return 0 ;
        nodeSum = node.val + dfs(node.left) + dfs(node.right);
        ans = Math.max(ans, (allSum - nodeSum) * nodeSum);
        return nodeSum;
    }
}
