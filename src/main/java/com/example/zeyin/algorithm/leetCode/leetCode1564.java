package com.example.zeyin.algorithm.leetCode;

import java.util.Arrays;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月03日 21:36
 * @Modify:
 */
public class leetCode1564 {

    public static int maxBoxesInWarehouse(int[] boxes, int[] warehouse) {

        //盒子升序排列
        Arrays.sort(boxes);

        //房间取相邻的最小值
        for (int i = 1; i < warehouse.length; i++) {
            warehouse[i] = Math.min(warehouse[i], warehouse[i - 1]);
        }

        //第以层盒子
        int boxesIndex = 0;
        int warehouseIndex = warehouse.length - 1;
        while (boxesIndex < boxes.length && warehouseIndex >= 0) {
            while (warehouseIndex >= 0 && warehouse[warehouseIndex] < boxes[boxesIndex]) {
                warehouseIndex--;
            }
            if (warehouseIndex >= 0) {
                boxesIndex++;
                warehouseIndex--;
            } else {
                break;
            }
        }
        return boxesIndex;
    }
}
