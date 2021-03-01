package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年03月01日 9:44
 * @Modify:
 */
public class leetcode142 {
    /**
     * 1、快慢指针循环，相遇时跳出
     * 2、第三个指针（从头开始）和慢指针（现在位置）同时移动一步，相等时输出位置
     * 注意：节点相等，不是节点的值相等
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(fast==null||fast.next==null) {
            return null;
        }

        slow=head;
        while(slow!=fast) {
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }
}
