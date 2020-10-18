package com.example.zeyin.algorithm;

/**
 * @Description: 小扣出去秋游，途中收集了一些红叶和黄叶，他利用这些叶子初步整理了一份秋叶收藏集 leaves， 字符串 leaves 仅包含小写字符 r 和 y， 其中字符 r 表示一片红叶，字符 y 表示一片黄叶。
 * 出于美观整齐的考虑，小扣想要将收藏集中树叶的排列调整成「红、黄、红」三部分。每部分树叶数量可以不相等，但均需大于等于 1。每次调整操作，小扣可以将一片红叶替换成黄叶或者将一片黄叶替换成红叶。请问小扣最少需要多少次调整操作才能将秋叶收藏集调整完毕。
 * @Author: zeyin
 * @Date: 2020年10月18日 14:47
 * @Modify:
 */
public class leetcodeX_秋叶收藏集 {
    /**
     * f(i,j),j=0.1.2表示三个区域，i表示第i位index
     * j=0,f(i,j)=f(i-1,0)+isYellow(i);
     * j=1,f(i,j)=Math.min(f(i01,0),f(i-1,1))+isRed(i);
     * j=3,f(i,j)=Math.min(f(i-1,1),f(i-1,2))+isYellow(i);
     *
     */
    public int minimumOperations(String leaves) {
        int len = leaves.length();
        int[][] f = new int[len][3];
        f[0][0] = isYellow(leaves.charAt(0));

        f[0][1] = f[0][2] = f[1][2] = Integer.MAX_VALUE;

        for (int i = 1; i < len; i++) {
            int isRed = isRed(leaves.charAt(i));
            int isYellow = isYellow(leaves.charAt(i));
            f[i][0] = f[i - 1][0] + isYellow;
            f[i][1] = Math.min(f[i - 1][0], f[i - 1][1]) + isRed;
            if (i >= 2) {
                f[i][2] = Math.min(f[i - 1][1], f[i - 1][2]) + isYellow;
            }
        }
        return f[len - 1][2];
    }

    private int isYellow(char c) {
        return c == 'y' ? 1 : 0;
    }

    private int isRed(char c) {
        return c == 'r' ? 1 : 0;
    }
}
