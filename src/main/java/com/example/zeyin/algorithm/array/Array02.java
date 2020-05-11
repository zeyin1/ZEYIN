package com.example.zeyin.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 二维数组
 * @Author: zeyin
 * @Date: 2020年04月05日 15:58:12
 * @Modify:
 */

public class Array02 {

    /**
     * @Description: 给定一个二维矩阵，计算其子矩形范围内元素的总和，
     * 该子矩阵的左上角为 (row1, col1) ，右下角为 (row2, col2)。
     * @Author: zeyin
     * @Date: 2020/4/5 15:59
     * @Modify:
     * @Param:
     * @Return:
     */
    public static int[][] NumMatrix(int[][] srcArray) {
        if (srcArray.length == 0 || srcArray[0].length == 0) {
            return new int[0][0];
        }

        //求矩阵的行数和列数；
        int row1 = srcArray.length;
        int row2 = srcArray[0].length;
        //输出矩阵
        int[][] desArray = new int[row1 + 1][row2 + 1];
        desArray[0][0] = srcArray[0][0];

        for (int i = 1; i < row1; i++)
            desArray[i][0] = desArray[i - 1][0] + srcArray[i][0];

        for (int j = 1; j < row2; j++)
            desArray[0][j] = desArray[0][j - 1] + srcArray[0][j];

        for (int i = 1; i < row1; i++) {
            for (int j = 1; j < row2; j++) {
                desArray[i][j] = desArray[i - 1][j] + desArray[i][j - 1] - desArray[i - 1][j - 1] + srcArray[i][j];
            }
        }

        return desArray;
    }

    /**
     * @Description: 两数之和
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * @Author: zeyin
     * @Date: 2020/5/11 20:27
     */
    public int[] twoSum(int[] pArray, int pTarget) {
        int[] wRes = new int[2];
        Map<Integer, Integer> wMap = new HashMap<>();
        for (int i = 0; i < pArray.length; i++) {
            wMap.put(pArray[i], i);
        }

        for (int i = 0; i < pArray.length; i++) {
            int wVal = pTarget - pArray[i];
            if (wMap.containsKey(wVal)
                    && (i != wMap.get(wVal))) {
                wRes[0] = i;
                wRes[1] = wMap.get(wVal);
                break;
            }
        }
        return wRes;
    }

    /**
     * @Description: 整数反转
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * @Author: zeyin
     * @Date: 2020/5/11 20:38
     */
    public int reverse(int val) {
        long result = 0;
        while (val != 0) {
            result = result * 10 + val % 10;
            val = val / 10;
        }

        if (result > Integer.MAX_VALUE
                || result < Integer.MIN_VALUE) {
            result = 0;
        }

        return (int) result;
    }

    /**
     * @Description: 字符串转换整数
     * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
     * <p>
     * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。接下来的转化规则如下：
     * <p>
     * 如果第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字字符组合起来，形成一个有符号整数。
     * 假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成一个整数。
     * 该字符串在有效的整数部分之后也可能会存在多余的字符，那么这些字符可以被忽略，它们对函数不应该造成影响。
     * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换，即无法进行有效转换。
     * <p>
     * 在任何情况下，若函数不能进行有效的转换时，请返回 0 。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/string-to-integer-atoi
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Author: zeyin
     * @Date: 2020/5/11 20:43
     */

    public int myAtoi(String val) {
        if (val == null
                || val.length() == 0) {
            return 0;
        }

        int i = 0;
        int pow = 0;
        int sign = 1;

        long res = 0;
        while (val.charAt(i) == ' '
                && (i < val.length() - 1)) {
            i++;
        }

        if (val.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (val.charAt(i) == '+') {
            i++;
        }

        for (; i < val.length(); i++) {
            if (val.charAt(i) < '0' || val.charAt(i) > '9') {
                return (int) res * sign;
            } else {
                res = res * 10 + (val.charAt(i) - '0');
                if ((res * sign) < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                } else if ((res * sign) > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            }
        }
        return (int) res * sign;
    }

    /**
     * @Description: 回文数
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     * @Author: zeyin
     * @Date: 2020/5/11 20:56
     */
    public boolean isPalindrome(int val) {
        String valStr = String.valueOf(val);
        StringBuilder valStrBld = new StringBuilder(valStr);
        if (valStr.equals(valStrBld.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }

}
