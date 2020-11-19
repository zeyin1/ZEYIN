package com.example.zeyin.algorithm.stackAndQueue;

import java.util.Stack;

/**
 * @Description: 用栈实现队列
 * @Author: zeyin
 * @Date: 2020年11月19日 19:43
 * @Modify:
 */
public class StackQueue {

    /**
     * (1)从栈1进，从栈2出ta
     * （2）栈2没有元素，把栈1的元素全部拷贝给栈2
     */
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int num) {
        stack1.push(num);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
