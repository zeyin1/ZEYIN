package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

/**
 * @Description: 两数之和
 * @Author: zeyin
 * @Date: 2020年11月20日 18:34
 * @Modify:
 */
public class leetcode2 {
    /**
     * 简化版本
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(0);
        ListNode curNode = headNode;
        int curVal =0;
        while (l1!=null||l2!=null|| curVal !=0){
            int val1=l1!=null?l1.val:0;
            int val2=l2!=null?l2.val:0;
            if (l1!=null){
                l1=l1.next;
            }
            if (l2!=null){
                l2=l2.next;
            }

            int sum=val1+val2+ curVal;
            curVal =sum/10;
            sum=sum%10;
            curNode.next=new ListNode(sum);
            curNode=curNode.next;
        }
        return headNode.next;
    }


    /**
     * 详细版本
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode method(ListNode l1, ListNode l2) {

        ListNode headNode = new ListNode(0);
        ListNode curNode = headNode;

        int c = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + c;
            l1 = l1.next;
            l2 = l2.next;
            c = sum / 10;
            sum = sum % 10;
            curNode.next = new ListNode((int) sum);
            curNode = curNode.next;
        }

        while (l1 != null) {
            int sum = l1.val + c;
            c = sum / 10;
            sum = sum % 10;
            curNode.next = new ListNode(sum);
            curNode = curNode.next;
        }

        while (l2 != null) {
            int sum = l2.val + c;
            c = sum / 10;
            sum = sum % 10;
            curNode.next = new ListNode(sum);
            curNode = curNode.next;
        }

        if (c > 0) {
            curNode.next = new ListNode(c);
            curNode = curNode.next;
        }

        return headNode.next;
    }
}
