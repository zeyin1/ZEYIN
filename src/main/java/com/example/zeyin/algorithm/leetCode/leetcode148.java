package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

/**
 * @Description: 排序链表
 *
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 *
 * @Author: zeyin
 * @Date: 2020年11月21日 13:29
 * @Modify:
 */
public class leetcode148 {

    /**
     * 拆分、递归、合并。
     * 1、把链表拆分为两个链表
     * 2、拆分后，分别对两个链表进行递归操作
     * 3、合并两个链表为一个链表
     */
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        //找中点
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //截取成两个链表
        ListNode tmpNode = slow.next;
        slow.next = null;

        //拆分后递归
        ListNode left = sortList(head);
        ListNode right = sortList(tmpNode);

        //归并
        ListNode NewNode = new ListNode(0);
        ListNode curNode;
        curNode = NewNode.next;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                curNode.next = left;
                curNode = curNode.next;
                left = left.next;
            } else {
                curNode.next = right;
                curNode = curNode.next;
                right = right.next;
            }
        }
        if (left != null) {
            curNode.next = left;
        }
        if (right != null) {
            curNode.next = right;
        }

        //返回头节点
        return NewNode.next.next;
    }
}
