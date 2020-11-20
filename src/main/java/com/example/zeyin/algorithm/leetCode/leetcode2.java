package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

/**
 * @Description: 两数之和
 * @Author: zeyin
 * @Date: 2020年11月20日 18:34
 * @Modify:
 */
public class leetcode2 {

    public static ListNode method(ListNode l1,ListNode l2){

        ListNode headNode=new ListNode(0);
        ListNode curNode=headNode;

        int c=0;
        while (l1!=null&&l2!=null){
            int sum=l1.val+l2.val+c;
            l1=l1.next;
            l2=l2.next;
            c=sum/10;
            sum=sum%10;
            curNode.next=new ListNode((int)sum);
            curNode=curNode.next;
        }

            while (l1!=null){
                int sum=l1.val+c;
                c=sum/10;
                sum=sum%10;
                curNode.next=new ListNode(sum);
                curNode=curNode.next;
            }

            while (l2!=null){
                int sum=l2.val+c;
                c=sum/10;
                sum=sum%10;
                curNode.next=new ListNode(sum);
                curNode=curNode.next;
            }

            if (c>0){
                curNode.next=new ListNode(c);
                curNode=curNode.next;
            }

            return headNode.next;
    }
}
