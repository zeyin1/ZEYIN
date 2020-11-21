package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 15:16
 * @Modify:
 */
public class leetcode105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length != inorder.length) {
            return null;
        }

        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return builder(preorder, 0, preorder.length - 1, inMap, 0, inorder.length - 1);
    }

    private TreeNode builder(int[] preOder, int preLeft, int preRight, Map<Integer, Integer> inMap, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        int val = preOder[preLeft];
        TreeNode root = new TreeNode(val);
        int index = inMap.get(val);
        root.left = builder(preOder, preLeft, preLeft + index - inLeft, inMap, inLeft, index - 1);
        root.right = builder(preOder, preLeft + index - inLeft + 1, preRight, inMap, index + 1, inRight);
        return root;
    }
}
