package com.example.zeyin.algorithm.array;

import com.example.zeyin.util.ListNode;

import java.util.*;

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

    /**
     * @Description: 罗马数字转整数
     * @Author: zeyin
     * @Date: 2020/5/11 21:39
     */
    public int romanToInt(String s) {
        int len = s.length();
        int n1 = 0;
        int n5 = 0;
        int n10 = 0;
        int n50 = 0;
        int n100 = 0;
        int n500 = 0;
        int n1000 = 0;
        int result = 0;
        int pre = 0;
        String[] a = new String[len];
        char[] chars = s.toCharArray();
        for (int i = len - 1; i > 0; i--) {
            char c = chars[i];
            String str = String.valueOf(c);
            a[i] = str;
        }
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I') {
                if (1 < pre) {
                    n1--;
                } else {
                    n1++;
                }
                pre = 1;
            }
            if (s.charAt(i) == 'V') {
                if (5 < pre) {
                    n5--;
                } else {
                    n5++;
                }
                pre = 5;
            }
            if (s.charAt(i) == 'X') {
                if (10 < pre) {
                    n10--;
                } else {
                    n10++;
                }
                pre = 10;
            }
            if (s.charAt(i) == 'L') {
                if (50 < pre) {
                    n50--;
                } else {
                    n50++;
                }
                pre = 50;
            }
            if (s.charAt(i) == 'C') {
                if (100 < pre) {
                    n100--;
                } else {
                    n100++;
                }
                pre = 100;
            }
            if (s.charAt(i) == 'D') {
                if (500 < pre) {
                    n500--;
                } else {
                    n500++;
                }
                pre = 500;
            }
            if (s.charAt(i) == 'M') {
                if (1000 < pre) {
                    n1000--;
                } else {
                    n1000++;
                }
                pre = 1000;
            }
        }
        result = result + 1000 * n1000 + 500 * n500 + 100 * n100 + 50 * n50 + 10 * n10 + 5 * n5 + 1 * n1;
        return result;
    }

    /**
     * @Description: 最长公共前缀
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * 如果不存在公共前缀，返回空字符串 ""。
     * @Author: zeyin
     * @Date: 2020/5/11 21:44
     */
    public String longestCommonPrefix(String[] val) {
        if (val == null || val.length == 0) {
            return "";
        }

        Arrays.sort(val);
        String begin = val[0];
        String end = val[val.length - 1];

        int num = 0;
        for (int i = 0; i < begin.length(); i++) {
            if (begin.charAt(i) == end.charAt(i)) {
                num++;
            } else {
                break;
            }
        }

        return begin.substring(0, num);
    }

    /**
     * @Description: 三数之和
     * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
     * <p>
     * 注意：答案中不可以包含重复的三元组。
     * @Author: zeyin
     * @Date: 2020/5/11 21:52
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; ) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[j] + nums[k] == -nums[i]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (nums[j] + nums[k] > -nums[i]) {
                    k--;
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else {
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
            }

            i++;
            while (i < nums.length - 2 && nums[i] == nums[i - 1]) {
                i++;
            }
        }
        return result;
    }

    /**
     * @Description: 最接近的三数之和
     * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/3sum-closest
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Author: zeyin
     * @Date: 2020/5/11 22:10
     */
    public int threeSumClosest(int[] nums, int target) {
        long minDiff = Long.MAX_VALUE;
        long result = 0;
        long diff;
        long sum;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                diff = Math.abs(target - sum);
                if (diff == 0) {
                    return (int) sum;
                }
                if (diff < minDiff) {
                    minDiff = diff;
                    result = sum;
                }

                if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return (int) result;
    }

    /**
     * @Description: 20. 有效的括号
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * <p>
     * 有效字符串需满足：
     * <p>
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/valid-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Author: zeyin
     * @Date: 2020/5/11 22:19
     */
    public boolean isValid(String s) {
        if ((s.length() & 1) == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(')');
            } else if (chars[i] == '{') {
                stack.push('}');
            } else if (chars[i] == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != chars[i]) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    /**
     * @Description: 21. 合并两个有序链表
     * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     * @Author: zeyin
     * @Date: 2020/5/11 22:23
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode head = list;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        while (l1 != null) {
            head.next = l1;
            l1 = l1.next;
            head = head.next;
        }
        while (l2 != null) {
            head.next = l2;
            l2 = l2.next;
            head = head.next;
        }
        return list.next;
    }

    /**
     * @Description: 26. 删除排序数组中的重复项
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Author: zeyin
     * @Date: 2020/5/12 20:36
     */
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (index == 0 || num != nums[index - 1]) {
                nums[index++] = num;
            }
        }
        return index;
    }

    /**
     * @Description: 27. 移除元素
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     * <p>
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-element
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Author: zeyin
     * @Date: 2020/5/12 20:41
     */
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int num : nums) {
            if (num != val) {
                nums[index++] = num;
            }
        }
        return index;
    }

    /**
     * @Description: 28. 实现 strStr()
     * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/implement-strstr
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Author: zeyin
     * @Date: 2020/5/12 21:29
     */
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();

        for (int i = 0; i < len1 - len2; i++) {
            int j = 0;
            for (; j < len2; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == len2) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @Description: 35. 搜索插入位置
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * <p>
     * 你可以假设数组中无重复元素。
     * 二分查找
     * @Author: zeyin
     * @Date: 2020/5/12 21:34
     */
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        if (left > right)
            return -1;
        if (left == right) {
            if (nums[left] >= target) {
                return left;
            } else {
                return right + 1;
            }
        }

        int mid = (left + right) / 2;

        if (target < nums[mid]) {
            return binarySearch(nums, target, left, mid);
        } else if (target == nums[mid]) {
            return mid;
        } else {
            return binarySearch(nums, target, mid + 1, right);
        }
    }

    /**
     * @Description: 38. 外观数列
     * <p>
     * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
     * <p>
     * 1.     1
     * 2.     11
     * 3.     21
     * 4.     1211
     * 5.     111221
     * 1 被读作  "one 1"  ("一个一") , 即 11。
     * 11 被读作 "two 1s" ("两个一"）, 即 21。
     * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
     * <p>
     * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
     * <p>
     * 注意：整数序列中的每一项将表示为一个字符串。
     * @Author: zeyin
     * @Date: 2020/5/12 21:38
     */
    public String countAndSay(int n) {
        String result = "";
        if (n == 1) {
            return "1";
        } else {
            String output = countAndSay(n - 1);
            int index = 0;
            while (index < output.length()) {
                char current = output.charAt(index);
                int cursor = index;
                int count = 0;
                while (cursor < output.length() && output.charAt(cursor) == current) {
                    cursor++;
                    count++;
                }
                char number = (char) (count + '0');
                result += number;
                result += current;
                index += count;
            }
        }
        return result;
    }

    /**
     * @Description: 53. 最大子序和
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * @Author: zeyin
     * @Date: 2020/5/12 21:42
     */
    public int maxSubArray(int[] nums) {
        int temp = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp = Math.max(temp + nums[i], nums[i]);
            max = Math.max(max, temp);
        }
        return max;
    }

    /**
     * @Description: 58. 最后一个单词的长度
     * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
     * <p>
     * 如果不存在最后一个单词，请返回 0 。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/length-of-last-word
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Author: zeyin
     * @Date: 2020/5/12 21:46
     */
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int end = len;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                break;
            }
            end = i;
        }
        int start = end;
        for (int i = start; i > 0; i--) {
            if (s.charAt(i - 1) == ' ') {
                break;
            }
            start = i - 1;
        }

        return end - start;

    }

    /**
     * @Description: 66. 加一
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     * <p>
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     * <p>
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/plus-one
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Author: zeyin
     * @Date: 2020/5/12 21:49
     */
    public int[] plusOne(int[] digits) {
        int c = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + c;
            c = sum / 10;
            digits[i] = sum % 10;
            if (c == 0)
                return digits;
        }
        int[] res = new int[(digits.length) + 1];
        res[0] = c;
        for (int i = 0; i < digits.length; i++) {
            res[i + 1] = digits[i];
        }
        return res;
    }

    /**
     * @Description: 67. 二进制求和
     * 给你两个二进制字符串，返回它们的和（用二进制表示）。
     * <p>
     * 输入为 非空 字符串且只包含数字 1 和 0。
     * @Author: zeyin
     * @Date: 2020/5/12 21:51
     */
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int pa = a.length() - 1;
        int pb = b.length() - 1;
        int carry = 0;
        while (pa >= 0 || pb >= 0) {
            int sum = carry;
            if (pa >= 0) {
                sum = sum + (a.charAt(pa) - '0');
                pa--;
            }
            if (pb >= 0) {
                sum = sum + (b.charAt(pb) - '0');
                pb--;
            }
            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            result.append('1');
        }

        return result.reverse().toString();
    }

    /**
     * @Description: 69. x 的平方根
     * 计算并返回 x 的平方根，其中 x 是非负整数。
     * <p>
     * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
     * @Author: zeyin
     * @Date: 2020/5/14 20:29
     */
    public int mySqrt(int x) {
        int i = 0;
        int j = x;
        while (i <= j) {
            int m = (i + j) / 2;
            long temp = (long) m * m;
            if (temp == x) {
                return m;
            } else if (temp > x) {
                j = m - 1;
            } else if (temp < x) {
                i = m + 1;
            }
        }
        return i - 1;
    }

}
