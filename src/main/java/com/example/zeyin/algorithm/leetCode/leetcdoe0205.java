package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 17:29
 * @Modify:
 */
public class leetcdoe0205 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode newHead = new ListNode(0);
        ListNode p = newHead;
        int c = 0;
        while(l1 != null && l2 != null) {
            int sum = l1.val+l2.val + c;
            p.next = new ListNode(sum%10);
            c = sum/10;
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            int sum = l1.val + c;
            p.next = new ListNode(sum%10);
            c = sum/10;
            p = p.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            int sum = l2.val + c;
            p.next = new ListNode(sum%10);
            c = sum/10;
            p = p.next;
            l2 = l2.next;
        }
        if (c != 0) {
            p.next = new ListNode(c);
        }
        return newHead.next;
    }
}
