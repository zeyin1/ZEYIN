package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

/**
 * @Description: 反转链表II
 *
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 *
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 *
 * @Author: zeyin
 * @Date: 2020年11月21日 14:50
 * @Modify:
 */
public class leetcode92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return head;
        }

        ListNode resNode = new ListNode(0);
        resNode.next = head;

        ListNode pre = resNode;
        for (int i = 1; i < m; i++) {
            pre = pre.next;//m-1次
        }

        head = pre.next;//m处节点
        for (int i = m; i < n; i++) {
            ListNode node = head.next;//node是2的下一个节点.node=3
            head.next = node.next;//让3的下一个节点和2的下一个相同，相当于2->4
            node.next = pre.next;//让1的下一个节点也就是2变成node的下一个节点,相当于让3->2
            pre.next = node;//相当于让1->3,最后整体连接起来，第一次的迭代就是1->3->2->4->5
        }
        return resNode.next;
    }
}
