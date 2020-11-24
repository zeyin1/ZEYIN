package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月24日 20:31
 * @Modify:
 */
public class leetcode82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return head;
        }

        ListNode newNode=new ListNode(0);
        ListNode tmpNode=newNode;

        while (head!=null&&head.next!=null){
            if (head.val==head.next.val){
                while (head.next!=null&&head.val==head.next.val){
                    head=head.next;
                }
                head=head.next;//跳出重复元素，下一个元素
            }else {
                tmpNode.next=head;
                tmpNode=tmpNode.next;
                head=head.next;
            }
        }
        tmpNode.next=head;
        return newNode.next;
    }
}
