package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

/**
 * @Description: 删除排序链表中的重复元素 II
 *
 *给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 *
 * 示例 1:
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 *
 * 示例 2:
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 *
 *
 * @Author: zeyin
 * @Date: 2020年11月24日 20:31
 * @Modify:
 */
public class leetcode82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode newNode = new ListNode(0);
        ListNode tmpNode = newNode;

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                //去重
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                head = head.next;//跳出重复元素，下一个元素
            } else {
                tmpNode.next = head;
                tmpNode = tmpNode.next;
                head = head.next;
            }
        }
        tmpNode.next = head;
        return newNode.next;
    }
}
