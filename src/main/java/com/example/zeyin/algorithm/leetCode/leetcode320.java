package com.example.zeyin.algorithm.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月29日 15:32
 * @Modify:
 */
public class leetcode320 {
    //dfs+回溯
    public List<String> generateAbbreviations(String word) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans, new StringBuilder(), word, 0, 0);
        return ans;
    }

    private void backtrack(List<String> ans, StringBuilder builder, String word, int i, int k) {
        int len = builder.length();
        if (i == word.length()) {
            if (k != 0) {
                builder.append(k);
            }
            ans.add(builder.toString());
        } else {
            //深度优先搜索
            backtrack(ans, builder, word, i + 1, k + 1);

            if (k != 0) {
                builder.append(k);
            }

            builder.append(word.charAt(i));
            backtrack(ans, builder, word, i + 1, 0);
        }
        builder.setLength(len);
    }
}
