package com.example.zeyin.offerOfBook;

import com.example.zeyin.util.TreeLinkNode;

/**
 * @Description: 二叉树的下一个节点
 * @Author: zeyin
 * @Date: 2020年12月13日 14:20
 * @Modify:
 */
public class Nbr8th {
    /**
     * @Description:
     * （1）一个节点有右子树，下一个节点为右子树的左节点
     * （2）一个节点是父节点的左子节点，下一个节点为父节点
     * （3）一个节点，没有右子树，但是它是父节点的右子节点，向上找到一个是它父节点的节点
     * @Author: zeyin
     * @Date: 2020/12/13 14:21
     */
    public TreeLinkNode getNext(TreeLinkNode pNode){
        if (pNode==null){
            return null;
        }

        if (pNode.right!=null){
            return getDeepPreNode(pNode.next);
        }else if (pNode.next!=null&&pNode==pNode.next.right){
            if (pNode.next==pNode.next.next.left){
                return pNode.next.next;
            }
            return null;
        }
        return pNode.next;
    }


    private TreeLinkNode getDeepPreNode(TreeLinkNode node){
        if (node==null){
            return null;
        }
        if (node.left!=null){
            return getDeepPreNode(node.next);
        }
        return node;
    }
}
