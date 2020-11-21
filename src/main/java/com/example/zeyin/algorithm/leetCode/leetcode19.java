package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 13:52
 * @Modify:
 */
public class leetcode19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        //没有n个元素
        if (fast == null) {
            head = head.next;
            return head;
        }

        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        //找到倒数第N个节点
        slow.next = slow.next.next;
        return head;
    }
}
