package com.example.zeyin.algorithm.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年08月15日 9:24
 * @Modify:
 */
public class PossibleBipartition {

    ArrayList<Integer>[] graph;
    Map<Integer, Integer> color;

    public boolean possibleBipartition(int N, int[][] dislikes) {
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; ++i)
            graph[i] = new ArrayList();

        for (int[] edge : dislikes) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        color = new HashMap();
        for (int node = 1; node <= N; ++node)
            if (!color.containsKey(node) && !dfs(node, 0))
                return false;
        return true;
    }

    public boolean dfs(int node, int c) {
        if (color.containsKey(node))
            return color.get(node) == c;
        color.put(node, c);

        for (int nei : graph[node])
            if (!dfs(nei, c ^ 1))
                return false;
        return true;
    }

    /**
     * @Description: 用一句话描述
     * @Author: zeyin
     * @Date: 2020/8/16 15:56
     */
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = nums[nums.length - 1];
        int res = -1;
        while (l <= r) {

            int mid = (l + r) / 2;
            int total = cal(nums, mid);
            if (total > threshold)
                l = mid + 1;
            else {
                res = mid;
                r = mid - 1;
            }
        }
        return l;
    }

    private int cal(int[] nums, int div) {
        int sum = 0;
        for (int n : nums) {
            sum += n / div;
            // 向上取整
            if (n % div != 0) sum += 1;
        }
        return sum;
    }


    public boolean canTransform(String start, String end) {
        int N = start.length();
        char[] S = start.toCharArray(), T = end.toCharArray();
        int i = -1, j = -1;
        while (++i < N && ++j < N) {
            while (i < N && S[i] == 'X') i++;
            while (j < N && T[j] == 'X') j++;
            /* At this point, i == N or S[i] != 'X',
               and j == N or T[j] != 'X'.  i and j
               are the indices representing the next
               occurrences of non-X characters in S and T.
            */

            // If only one of i < N and j < N, then it isn't solid-
            // there's more people in one of the strings.
            if ((i < N) ^ (j < N)) return false;

            if (i < N && j < N) {
                // If the person isn't the same, it isn't solid.
                // Or, if the person moved backwards, it isn't accessible.
                if (S[i] != T[j] || (S[i] == 'L' && i < j) ||
                        (S[i] == 'R' && i > j))
                    return false;
            }
        }
        return true;
    }

    public boolean canTransform1(String start, String end) {
        if (!start.replace("X", "").equals(end.replace("X", "")))
            return false;

        int t = 0;
        for (int i = 0; i < start.length(); ++i)
            if (start.charAt(i) == 'L') {
                while (end.charAt(t) != 'L') t++;
                if (i < t++) return false;
            }

        t = 0;
        for (int i = 0; i < start.length(); ++i)
            if (start.charAt(i) == 'R') {
                while (end.charAt(t) != 'R') t++;
                if (i > t++) return false;
            }

        return true;
    }

    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[]{0, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int n : nums) {
            int[] dp2 = new int[3];

            for (int i = 0; i < 3; i ++) {
                dp2[(i + n) % 3] = Math.max(dp[(i + n) % 3], dp[i] + n);
            }

            dp = dp2;
        }
        return dp[0];
    }

    public int characterReplacement(String s, int k) {
        int []map=new int[26];
        // 窗口内出现次数最多的字符的出现次数
        int maxCount=0;
        char []a=s.toCharArray();
        int left=0,right=0;
        int res=0;
        // right一直向右扩充
        for(right=0;right<a.length;right++){
            map[a[right]-'A']++;
            // 每扩充一格 就重新计算maxCount
            maxCount=Math.max(maxCount,map[a[right]-'A']);

            // 重复字符可以填满整个窗口,更新结果。
            if(right-left+1-maxCount<=k){
                res=Math.max(right-left+1,res);
            }
            // 窗口大小 减去 重复字符出现次数>k ，说明重复字符不能填满整个窗口
            else {
                map[a[left]-'A']--;
                left++;
            }
        }
        return res;
    }

    public List<String> generateAbbreviations(String word){
        List<String> ans = new ArrayList<String>();
        backtrack(ans, new StringBuilder(), word, 0, 0);
        return ans;
    }

    // i is the current position
    // k is the count of consecutive abbreviated characters
    private void backtrack(List<String> ans, StringBuilder builder, String word, int i, int k){
        int len = builder.length(); // keep the length of builder
        if(i == word.length()){
            if (k != 0) builder.append(k); // append the last k if non zero
            ans.add(builder.toString());
        } else {
            // the branch that word.charAt(i) is abbreviated
            backtrack(ans, builder, word, i + 1, k + 1);

            // the branch that word.charAt(i) is kept
            if (k != 0) builder.append(k);
            builder.append(word.charAt(i));
            backtrack(ans, builder, word, i + 1, 0);
        }
        builder.setLength(len); // reset builder to the original state
    }





}
