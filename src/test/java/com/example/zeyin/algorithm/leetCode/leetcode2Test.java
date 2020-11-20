package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月20日 18:44
 * @Modify:
 */
@SpringBootTest
public class leetcode2Test {

    @Test
    public void test(){
        ListNode l1=new ListNode(2);
        ListNode tmpL1=l1;
        tmpL1.next=new ListNode(4);
        tmpL1=tmpL1.next;
        tmpL1.next=new ListNode(3);

        ListNode l2=new ListNode(5);
        ListNode tmpL2=l2;
        tmpL2.next=new ListNode(6);
        tmpL2=tmpL2.next;
        tmpL2.next=new ListNode(4);
        tmpL2=tmpL2.next;

        ListNode res=leetcode2.method(l1,l2);
        while (res!=null){
            System.out.print(" "+res.val);
            res=res.next;
        }
    }
}
