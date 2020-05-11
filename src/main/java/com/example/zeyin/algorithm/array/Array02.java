package com.example.zeyin.algorithm.array;

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
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/valid-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Author: zeyin
     * @Date: 2020/5/11 22:19
     */
    public boolean isValid(String s) {
        if((s.length()&1)==1) {
            return false;
        }
        Stack<Character> stack=new Stack<Character>();
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++) {
            if(chars[i]=='(') {
                stack.push(')');
            }else if(chars[i]=='{') {
                stack.push('}');
            }else if(chars[i]=='[') {
                stack.push(']');
            }else if(stack.isEmpty()||stack.pop()!=chars[i]) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    //20200511
}
