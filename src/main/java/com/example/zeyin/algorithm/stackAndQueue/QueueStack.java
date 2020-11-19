package com.example.zeyin.algorithm.stackAndQueue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Description: 用队列实现栈
 * @Author: zeyin
 * @Date: 2020年11月19日 19:43
 * @Modify:
 */
public class QueueStack {

    /**
     * （1）队列1为主，元素个数为1，直接出队列；
     * （2）队列1元素个数不为1，则把元素放入队列2，把最后一个元素出队列；然后再把队列2的元素重新放入队列1
     */
    private Queue<Integer> queue1 = new ArrayDeque<>();
    private Queue<Integer> queue2 = new ArrayDeque<>();

    public void push(int nums) {
        queue1.offer(nums);
    }

    public int pop() {
        //一个元素没有
        if (queue1.isEmpty()) {
            return 99999999;
        }

        //队列元素个数为1
        if (queue1.size() == 1) {
            return queue1.poll();
        }

        //队列1元素个数不为1
        while (queue1.size() != 1) {
            queue2.offer(queue1.poll());
        }
        int res = queue1.poll();

        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }
        return res;
    }
}
