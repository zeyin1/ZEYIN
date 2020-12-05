package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年12月05日 20:15
 * @Modify:
 */
public class leetcode1019 {

    //栈中存索引
    public static int[] nextLargerNodes(ListNode head) {

        List<Integer> list=new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }

        int[] res=new int[list.size()];
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<list.size();i++){
            while (!stack.isEmpty()&&list.get(stack.peek())<list.get(i)){
                res[stack.peek()]=list.get(i);
                stack.pop();
            }
            stack.push(i);
        }

        return res;

    }
}
