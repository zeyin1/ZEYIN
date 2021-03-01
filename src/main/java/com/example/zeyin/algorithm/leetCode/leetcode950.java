package com.example.zeyin.algorithm.leetCode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 12:49
 * @Modify:
 */
public class leetcode950 {

    public static int[] deckRevealedIncreasing(int[] deck) {
        int N = deck.length;
        Deque<Integer> index = new LinkedList();
        for (int i = 0; i < N; ++i)
            index.add(i);

        int[] ans = new int[N];
        Arrays.sort(deck);
        for (int card : deck) {
            ans[index.pollFirst()] = card;
            if (!index.isEmpty()) {
                //把队列首位的元素放入队尾
                index.add(index.pollFirst());
            }
        }

        return ans;
    }
}
