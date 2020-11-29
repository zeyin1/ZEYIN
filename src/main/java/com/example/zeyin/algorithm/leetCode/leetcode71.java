package com.example.zeyin.algorithm.leetCode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 16:19
 * @Modify:
 */
public class leetcode71 {

    //栈实现
    public String simplifyPath(String path) {

        Deque<String> stack = new LinkedList<>();
        for (String item : path.split("/")) {
            if (item.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!item.isEmpty() && !item.equals(".")) {
                stack.push(item);
            }
        }

        String res = "";
        for (String d : stack)
            res = "/" + d + res;

        return res.isEmpty() ? "/" : res;
    }
}
