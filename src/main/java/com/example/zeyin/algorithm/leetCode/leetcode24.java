package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 14:18
 * @Modify:
 */
public class leetcode24 {

    //递归1
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode NewNode = head.next;
        head = swapPairs(NewNode.next);
        NewNode.next = head;
        return NewNode;
    }

    //递归2
    public ListNode swapPairs1(ListNode head) {
        ListNode curNode = head;
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curNodeNextNext = head.next.next;
        ListNode curNodeNext = curNode.next;
        curNodeNext.next = curNode;

        ListNode NewNode = swapPairs1(curNodeNextNext);
        curNode.next = NewNode;

        return curNodeNext;
    }

}
