package com.example.zeyin.offerOfBook;

import com.example.zeyin.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 重建二叉树
 * @Author: zeyin
 * @Date: 2020年12月13日 14:13
 * @Modify:
 */
public class Nbr7th {

    public TreeNode reconstructe(int[] pre,int[] in){
        int prelen=pre.length;
        int inLen=in.length;
        if (prelen!=inLen){
            return null;
        }

        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<inLen;i++){
            map.put(in[i],i);
        }
        return builder(pre,0,prelen-1,map,0,inLen-1);
    }

    private TreeNode builder(int[] pre, int preLeft, int preright, Map<Integer,Integer> map,
                             int inleft,int inright){
        if (preLeft>preright||inleft>inright){
            return null;
        }

        int rootval=pre[preLeft];
        TreeNode root=new TreeNode(rootval);
        int index=map.get(rootval);

        root.left=builder(pre,preLeft+1,preLeft+index-inleft,map,inleft,index-1);
        root.right=builder(pre,index-inleft+preLeft+1,preright,map,index+1,inright);
        return root;
    }
}
