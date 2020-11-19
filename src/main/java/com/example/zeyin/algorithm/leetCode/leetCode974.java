package com.example.zeyin.algorithm.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 和可被K整除
 * @Author: zeyin
 * @Date: 2020年11月19日 21:12
 * @Modify:
 */
public class leetCode974 {

    public static int subarraysDivByK(int[] A, int K) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);//一个元素都不要

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            int module = (sum % K + K) % K;//避免负数
            map.put(module, map.getOrDefault(module, 0) + 1);
        }

        //相同值得数量，进行排列组合(整除得情况恰好是模值个数得N*(N-1)/2种)
        int res = 0;
        for (Map.Entry<Integer, Integer> tmp : map.entrySet()) {
            res += tmp.getValue() * (tmp.getValue() - 1) / 2;
        }
        return res;
    }
}
