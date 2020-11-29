package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 13:13
 * @Modify:
 */
public class leetcode777 {

    public static boolean canTransform(String start, String end) {
        if (!start.replace("X", "").equals(end.replace("X", "")))
            return false;

        int t = 0;
        //XL变更成LX
        for (int i = 0; i < start.length(); ++i)
            if (start.charAt(i) == 'L') {
                while (end.charAt(t) != 'L') t++;
                if (i < t++) return false;
            }

        t = 0;
        //RX变更成XR
        for (int i = 0; i < start.length(); ++i)
            if (start.charAt(i) == 'R') {
                while (end.charAt(t) != 'R') t++;
                if (i > t++) return false;
            }

        return true;
    }
}
