package com.example.zeyin.algorithm;

import com.example.zeyin.algorithm.util.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 力扣热题
 * @Author: zeyin
 * @Date: 2020年05月14日 20:35
 * @Modify:
 */
public class LiCOdeHotAlgorithm {
    /**
     * @Description: 1. 两数之和
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Author: zeyin
     * @Date: 2020/5/14 20:36
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++) {
            int v=target-nums[i];
            if(map.containsKey(v)&&i!=map.get(v)) {
                res[0]=i;
                res[1]=map.get(v);
                return res;
            }
        }
        return res;
    }

    /**
     * @Description: 2. 两数相加
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     *
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     *
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/add-two-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Author: zeyin
     * @Date: 2020/5/14 20:38
     */
    public ListNode addTwoNumbers(ListNode pListNode1, ListNode ListNode2) {
        int carry =0;
        ListNode headNode=new ListNode(0);
        ListNode curNode=headNode;
        while((pListNode1 !=null) && (ListNode2 !=null)){
            int sum= pListNode1.val+ ListNode2.val+ carry;
            pListNode1 = pListNode1.next;
            ListNode2 = ListNode2.next;
            carry =sum/10;
            sum%=10;
            headNode.next=new ListNode((int)sum);
            headNode=headNode.next;
        }
        if(pListNode1 !=null) {
            while(pListNode1 !=null) {
                int sum= pListNode1.val+ carry;
                pListNode1 = pListNode1.next;
                carry =sum/10;
                sum%=10;
                headNode.next=new ListNode((int)sum);
                headNode=headNode.next;
            }
        }
        if(ListNode2 !=null)        {
            while(ListNode2 !=null) {
                int sum= ListNode2.val+ carry;
                ListNode2 = ListNode2.next;
                carry =sum/10;
                sum%=10;
                headNode.next=new ListNode((int)sum);
                headNode=headNode.next;
            }
        }
        if(carry !=0) {
            headNode.next=new ListNode((int) carry);
            headNode=headNode.next;
        }

        return curNode.next;
    }
    
    /**
     * @Description: 3. 无重复字符的最长子串
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * @Author: zeyin
     * @Date: 2020/5/14 20:42
     */
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int res = 0;
        int end=0;
        int start=0;
        Map<Character,Integer> map=new HashMap<>();
        for(; start< length && end< length; end++){
            if(map.containsKey(s.charAt(end))){
                start=Math.max(map.get(s.charAt(end)),start);//从有重复的下一个位置继续找
            }
            map.put(s.charAt(end),end+1);//map每次更新
            res=Math.max(res,end-start+1);//结果每次更新
        }
        return res;
    }

    /**
     * @Description: 4. 寻找两个正序数组的中位数
     * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
     *
     * 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
     *
     * 你可以假设 nums1 和 nums2 不会同时为空。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Author: zeyin
     * @Date: 2020/5/14 20:51
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int N = nums1.length + nums2.length;
        if (N % 2 == 1)
            return findKth(nums1, 0, nums2, 0, N / 2 + 1);
        else
            return (findKth(nums1, 0, nums2, 0, N / 2 + 1) + findKth(nums1, 0, nums2, 0, N / 2)) / 2.0;
    }

    // 返回第k大的元素，从1开始。
    private int findKth(int[] a, int alo, int[] b, int blo, int k) {
        // a数组为空时，返回b数组第k个元素
        // k从1开始
        // alo,blo是第一个元素
        if (alo >= a.length)
            return b[blo + k - 1];
        // b数组为空时，返回a数组第k个元素
        if (blo >= b.length)
            return a[alo + k - 1];
        // 当k==1时，返回a[alo]、b[alo]中小的那个
        if (k == 1)
            return Math.min(a[alo], b[blo]);
        // i表示mid到lo之间的差值
        int i = k / 2 - 1;
        int aMid = Integer.MAX_VALUE;
        int bMid = Integer.MAX_VALUE;
        // lo+i正好为中位数下标位置
        if (alo + i < a.length)
            aMid = a[alo + i];
        if (blo + i < b.length)
            bMid = b[blo + i];
        if (aMid < bMid)
            // 在amid之前，包括amid，不可能存在中位数，跳过查找（删除），
            // alo到amid（包括）之间有i+1个数字
            // 去掉i+1个数字，原来第k大，变成第k-（i+1）大
            return findKth(a, alo + i + 1, b, blo, k - i - 1);
        else
            return findKth(a, alo, b, blo + i + 1, k - i - 1);
    }

    /**
     * @Description: 5. 最长回文子串
     * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
     * @Author: zeyin
     * @Date: 2020/5/14 21:06
     */
    public String longestPalindrome(String s) {
        if(s==null)
            return null;
        if(s.length()==1)
            return s;

        int n=s.length();
        char[] cs=s.toCharArray();
        int max=1;
        int maxIndex=0;
        boolean dp[][]=new boolean[n][n];

        for(int i=0;i<n;i++) {
            dp[i][i]=true;
            maxIndex=i;
        }
        for(int i=0;i<n-1;i++) {
            if(cs[i]==cs[i+1]) {
                dp[i][i+1]=true;
                max=2;
                maxIndex=i;
            }
        }

        for(int len=3;len<=n;len++) {
            for(int i=0;i<n-(len-1);i++) {
                int j=i+len-1;

                if(cs[i]==cs[j]&&dp[i+1][j-1]) {
                    max=len;
                    maxIndex=i;
                    dp[i][j]=true;
                }
            }
        }
        return s.substring(maxIndex, maxIndex+max);
    }

    /**
     * @Description: 10. 正则表达式匹配
     * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
     * @Author: zeyin
     * @Date: 2020/5/14 21:14
     */
    public boolean isMatch(String text, String pattern) {
        //如果都为空则匹配成功
        if (pattern.isEmpty()) return text.isEmpty();

        //第一个是否匹配上
        boolean first_match = (!text.isEmpty() && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            //看有没有可能,剩下的pattern匹配上全部的text
            //看有没有可能,剩下的text匹配整个pattern
            //isMatch(text, pattern.substring(2)) 指当p第二个为*时，前面的字符不影响匹配所以可以忽略，所以将*以及*之前的一个字符删除后匹配之后的字符，这就是为什么用pattern.substring(2)
            //如果第一个已经匹配成功，并且第二个字符为*时，这是我们就要判断之后的需要匹配的字符串是否是多个前面的元素（*的功能），这就是first_match && isMatch(text.substring(1), pattern))的意义
            return (isMatch(text, pattern.substring(2)) || (first_match && isMatch(text.substring(1), pattern)));
        } else {
            //没有星星的情况:第一个字符相等,而且剩下的text,匹配上剩下的pattern，没有星星且第一个匹配成功，那么s和p同时向右移动一位看是否仍然能匹配成功
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }

    /**
     * @Description: 11. 盛最多水的容器
     * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     *
     * 说明：你不能倾斜容器，且 n 的值至少为 2。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/container-with-most-water
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Author: zeyin
     * @Date: 2020/5/14 21:19
     */



}
