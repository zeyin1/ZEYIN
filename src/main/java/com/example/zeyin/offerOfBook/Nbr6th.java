package com.example.zeyin.offerOfBook;

import com.example.zeyin.util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 从头到尾打印链表
 * @Author: zeyin
 * @Date: 2020年12月13日 14:09
 * @Modify:
 */
public class Nbr6th {

    //递归
    public List<Integer> print(ListNode head) {
        List<Integer> res = new ArrayList<>();

        if (head != null) {
            if (head.next != null) {
                res = print(head.next);
            }
            res.add(head.val);
        }

        return res;
    }
}
