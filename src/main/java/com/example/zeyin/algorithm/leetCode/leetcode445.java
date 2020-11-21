package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

import java.util.Stack;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 17:15
 * @Modify:
 */
public class leetcode445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        int c = 0;
        ListNode head = null;
        while (!stack1.isEmpty() || !stack2.isEmpty() || c > 0) {
            int val1 = stack1.isEmpty() ? 0 : stack1.pop();
            int val2 = stack2.isEmpty() ? 0 : stack2.pop();
            int sum = val1 + val2 + c;
            c = sum / 10;
            sum = sum % 10;

            ListNode node = new ListNode(sum);
            node.next = head;
            head = node;
        }
        return head;
    }
}
