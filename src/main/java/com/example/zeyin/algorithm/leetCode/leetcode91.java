package com.example.zeyin.algorithm.leetCode;

/**
 * @Description: 解码方法
 *
 *一条包含字母 A-Z 的消息通过以下映射进行了 编码 ：
 *
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 要 解码 已编码的消息，所有数字必须基于上述映射的方法，反向映射回字母（可能有多种方法）。例如，"111" 可以将 "1" 中的每个 "1" 映射为 "A" ，从而得到 "AAA" ，或者可以将 "11" 和 "1"（分别为 "K" 和 "A" ）映射为 "KA" 。注意，"06" 不能映射为 "F" ，因为 "6" 和 "06" 不同。
 *
 * 给你一个只含数字的 非空 字符串 num ，请计算并返回 解码 方法的 总数 。
 *
 * 题目数据保证答案肯定是一个 32 位 的整数。
 *
 * 输入：s = "12"
 * 输出：2
 * 解释：它可以解码为 "AB"（1 2）或者 "L"（12）。
 *
 * 方法：
 * dp[i + 1] = dp[i + 1] + dp[i - 1];//加上i-1前的统计
 *
 * @Author: zeyin
 * @Date: 2020年11月21日 20:40
 * @Modify:
 */
public class leetcode91 {
    public int numDecodings(String s) {

        //入参检查
        if (s == null || s.length() == 0) {
            return 0;
        }

        int len = s.length();

        //数值长度
        int[] dp = new int[len + 1];//解码方式数
        dp[0] = 1;
        dp[1] = (s.charAt(0) == '0') ? 0 : 1;

        for (int i = 1; i < len; i++) {
            char c = s.charAt(i);
            char pre = s.charAt(i - 1);

            dp[i + 1] = (c == '0') ? 0 : dp[i];//单独成为一个字母
            if (pre == '1' || (pre == '2' && c <= '6')) {
                dp[i + 1] = dp[i + 1] + dp[i - 1];//加上i-1前的统计
            }
        }
        return dp[len];
    }
}
