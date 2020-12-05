package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年12月05日 20:45
 * @Modify:
 */
public class leetcode1171 {
    //Map容器
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = head;

        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        //把求和值与节点存入Map,值相等的节点，存入最后一个节点
        for (ListNode tmpNode = res; tmpNode != null; tmpNode = tmpNode.next) {
            sum += tmpNode.val;
            map.put(sum, tmpNode);
        }

        //重构链表，删除中间节点
        sum = 0;
        for (ListNode tmpNode = res; tmpNode != null; tmpNode = tmpNode.next) {
            sum += tmpNode.val;
            tmpNode.next = map.get(sum).next;
        }
        return res.next;
    }
}
