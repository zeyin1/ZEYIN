package com.example.zeyin.algorithm.leetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月04日 19:04
 * @Modify:
 */
public class leetCode1614 {

    private HashMap<Double, List<Integer>> map;

    public int[] bestLine(int[][] points) {

        map = new LinkedHashMap<>();
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double k = compute(points[j][0] - points[i][0], points[j][1] - points[i][1]);
                List<Integer> list;
                if (!map.containsKey(k)) {
                    list = new LinkedList<>();
                    list.add(i);
                    list.add(j);
                    map.put(k, list);
                } else {
                    list = map.get(k);
                    list.add(j);
                }

                if (list.size() > res.size()) {
                    res = list;
                }
            }
            map = new LinkedHashMap<>();
        }

        return new int[]{res.get(0), res.get(1)};
    }

    private double compute(int x, int y) {
        if (x == 0) {
            return -12345.0;
        } else if (y == 0) {
            return 0;
        } else {
            return (double) y / (double) x;
        }
    }
}
