package com.example.zeyin.algorithm.other;

import com.example.zeyin.util.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 面试过程中遇到的题目
 * @Author: zeyin
 * @Date: 2021年03月01日 16:54
 * @Modify:
 */
public class ProblemOfPractice {
    /**
     * 求两个正整数相除的循环小数位的长度
     *
     * @param m
     * @param n
     * @return
     */
    public static int method1(int m, int n) {
        //求循环位数
        String res = "";
        if (m <= 0 || n <= 0) {
            return res.length();
        }

        int c = m % n;
        if (c == 0) {
            return res.length();
        }

        StringBuilder sb = new StringBuilder();
        int index = 1;
        Map<Integer, Integer> map = new HashMap<>();
        while (c > 0) {
            if (!map.containsKey(c)) {
                map.put(c, index);
                sb.append(c / n);

                c = (c * 10) % n;//余数
                index++;
            } else {
                //结果
                res = sb.substring(map.get(c), index);
                break;
            }
        }
        return res.length();
    }

    /**
     * @Description: 求单链表倒数第K个节点
     * @Author: zeyin
     * @Date: 2021/3/1 16:55
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }

        ListNode former = head;
        ListNode latter = head;
        for (int i = 0; i < k; i++) {
            former = former.next;
        }
        if (former == null) {
            return null;
        }

        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

    /**
     * @Description: 26进制转换
     * @Author: zeyin
     * @Date: 2021/3/8 9:37
     */
    public static String method(int num) {
        if (num <= 0) {
            return "";
        }

        Map<Integer, String> map = getMap();
        StringBuilder res = new StringBuilder();
        while (num > 0) {
            num--;
            int cur = num % 26;
            res.append(map.get(cur));
            num = num / 26;
        }
        return res.reverse().toString();
    }

    private static Map<Integer, String> getMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "A");
        map.put(1, "B");
        map.put(2, "C");
        map.put(3, "D");
        map.put(4, "E");
        map.put(5, "F");
        map.put(6, "G");
        map.put(7, "H");
        map.put(8, "I");
        map.put(9, "J");
        map.put(10, "K");
        map.put(11, "L");
        map.put(12, "M");
        map.put(13, "N");
        map.put(14, "O");
        map.put(15, "P");
        map.put(16, "Q");
        map.put(17, "R");
        map.put(18, "S");
        map.put(19, "T");
        map.put(20, "U");
        map.put(21, "V");
        map.put(22, "W");
        map.put(23, "X");
        map.put(24, "Y");
        map.put(25, "Z");
        return map;
    }

    /**
     * @Description: 一个数组，有两个不同的数出现两次，其余数都出现两次
     * @Author: zeyin
     * @Date: 2021/3/8 11:02
     */
    public static List<Integer> method(int[] nums) {

        List<Integer> resList = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return resList;
        }

        int tempNum = 0;
        for (int num : nums) {
            tempNum = tempNum ^ num;
        }
        int res = tempNum;

        int index = 1;
        while (tempNum > 0) {
            //找到为1的位数
            if (kth(tempNum, 1)) {
                break;
            }
            tempNum = tempNum / 2;
            index++;
        }

        tempNum = 0;
        for (int num : nums) {
            if (kth(num, index)) {
                tempNum = tempNum ^ num;
            }
        }
        int res1 = tempNum;

        int res2 = res ^ res1;
        resList.add(res1);
        resList.add(res2);
        return resList;
    }


    private static boolean kth(int num, int index) {
        num = num >> (index - 1);
        return (num & 1) > 0;
    }

    /**
     * @Description: 皇后互相攻击问题
     * @Author: zeyin
     * @Date: 2021/3/8 15:03
     */
    public static int method(int[][] arrays) {

        //（x坐标，皇后个数）
        Map<Integer, Integer> nodeMap = new HashMap<>();
        //(x坐标，皇后对数)
        Map<Integer, Integer> valMap = new HashMap<>();

        for (int[] array : arrays) {
            if (nodeMap.containsKey(array[0])) {
                //计算对数
                int val = valMap.get(array[0]) + nodeMap.get(array[0]);
                valMap.put(array[0], val);
                //计算皇后数
                int node = nodeMap.get(array[0]) + 1;
                nodeMap.put(array[0], node);
            } else {
                //计算对数
                valMap.put(array[0], 0);
                //计算皇后数
                nodeMap.put(array[0], 1);
            }
        }

        //整合对数结果
        int resCount = 0;
        for (Map.Entry<Integer, Integer> tempMap : valMap.entrySet()) {
            resCount += tempMap.getValue();
        }
        return resCount;
    }
}
