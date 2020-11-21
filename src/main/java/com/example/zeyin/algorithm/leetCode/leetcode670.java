package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 最大交换
 * @Author: zeyin
 * @Date: 2020年11月20日 22:14
 * @Modify:
 */
public class leetcode670 {
    public int maximumSwap(int num) {
        char[] ch = String.valueOf(num).toCharArray();
        boolean isSwap = false;

        for (int i = 0; i < ch.length; i++) {
            char max = 0;
            int idx = -1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[j] > ch[i] && ch[j] > max) {
                    max = ch[j];
                    idx = j;
                    isSwap = true;
                }
            }

            if (isSwap) {
                char tmp = ch[i];
                ch[i] = ch[idx];
                ch[idx] = tmp;
                break;
            }
        }
        return Integer.parseInt(new String(ch));
    }
}
