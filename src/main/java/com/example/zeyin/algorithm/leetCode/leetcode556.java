package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.ExchangeUtil;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月21日 9:13
 * @Modify:
 */
public class leetcode556 {

    public static int nextGreaterElement(int n) {
        char[] chars = String.valueOf(n).toCharArray();

        for (int i = chars.length - 1; i > 0; i++) {
            try {
                //（从右到左）找到一个目标值，其高位大于目标值
                if (chars[i - 1] >= chars[i]) continue;
                i--;

                //（从左到右）找到比目标值较小的元素
                int j = i;
                while (j != chars.length - 1 && chars[j + 1] > chars[i]) {
                    j++;
                }

                //交换目标值和j对应的元素
                ExchangeUtil.exchange(i, j, chars);

                //把i后的元素反转
                for (int k = i + 1; k <= i + (chars.length - 1 - i) / 2; k++) {
                    ExchangeUtil.exchange(k, chars.length - k + i, chars);
                }

                return Integer.parseInt(new String(chars));
            } catch (Exception e) {
                return -1;
            }
        }
        return -1;
    }
}
