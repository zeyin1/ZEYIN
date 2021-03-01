package com.example.zeyin.algorithm.other;

import com.example.zeyin.util.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 面试过程中遇到的题目
 * @Author: zeyin
 * @Date: 2021年03月01日 16:54
 * @Modify:
 */
public class ProblemOfPractice {
    /**
     * 求两个正整数相除的循环小数位的长度
     *
     * @param m
     * @param n
     * @return
     */
    public static int method1(int m, int n) {
        //求循环位数
        String res = "";
        if (m <= 0 || n <= 0) {
            return res.length();
        }

        int c = m % n;
        if (c == 0) {
            return res.length();
        }

        StringBuilder sb = new StringBuilder();
        int index = 1;
        Map<Integer, Integer> map = new HashMap<>();
        while (c > 0) {
            if (!map.containsKey(c)) {
                map.put(c, index);
                sb.append(c / n);

                c = (c * 10) % n;//余数
                index++;
            } else {
                //结果
                res = sb.substring(map.get(c), index);
                break;
            }
        }
        return res.length();
    }

    /**
     * @Description: 求单链表倒数第K个节点
     * @Author: zeyin
     * @Date: 2021/3/1 16:55
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }

        ListNode former = head;
        ListNode latter = head;
        for (int i = 0; i < k; i++) {
            former = former.next;
        }
        if (former == null) {
            return null;
        }

        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}
