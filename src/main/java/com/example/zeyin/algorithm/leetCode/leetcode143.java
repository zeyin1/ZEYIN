package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 15:38
 * @Modify:
 */
public class leetcode143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        //拆成两个链表
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode secondNode = slow.next;

        //倒序
        secondNode = reverse(secondNode);

        //奇偶插入
        ListNode firstNode = head;
        while (secondNode != null) {
            ListNode next = firstNode.next;
            firstNode.next = secondNode;

            secondNode = secondNode.next;
            firstNode = firstNode.next;
            firstNode.next = next;
            firstNode = firstNode.next;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode preNode = null;
        ListNode nextNode = null;
        while (head != null) {
            nextNode = head.next;
            head.next = preNode;
            preNode = head;
            head = nextNode;
        }
        return preNode;
    }
}
