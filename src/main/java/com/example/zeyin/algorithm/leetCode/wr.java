package com.example.zeyin.algorithm.leetCode;

import java.util.Arrays;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年11月25日 20:26
 * @Modify:
 */
public class wr {
    public static int[][] Method(int[][] nums) {
        if (nums == null || nums.length <= 0) {
            return nums;
        }


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == 0) {
                    nums[i][0] = 2;
                    if (nums[i][0] == 3) {
                        nums[i][0] = 4;
                    } else {
                        nums[i][0] = 2;
                    }


                    if (nums[0][j] == 2) {
                        nums[0][j] = 4;
                    } else {
                        nums[0][j] = 3;
                    }
                }
            }
        }


        for (int i = 1; i < nums.length; i++) {
            if (nums[i][0] == 2) {
                for (int j = 0; j < nums[0].length; j++) {
                    nums[i][j] = 0;
                }
            }
        }


        for (int j = 1; j < nums[0].length; j++) {
            if (nums[0][j] == 3) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i][j] = 0;
                }
            }

        }

        if (nums[0][0] == 2) {
            Arrays.fill(nums[0], 0);
            for (int i = 1; i < nums.length; i++) {
                if (nums[i][0] == 2) {
                    nums[i][0] = 0;
                }
            }
        }

        if (nums[0][0] == 3) {
            for (int i = 0; i < nums.length; i++) {
                nums[i][0] = 0;
            }

            for (int j = 1; j < nums[0].length; j++) {
                if (nums[0][j] == 3) {
                    nums[0][j] = 0;
                }
            }

        }

        if (nums[0][0] == 4) {
            for (int i = 0; i < nums.length; i++) {
                nums[i][0] = 0;
            }
            Arrays.fill(nums[0], 0);
        }
        return nums;
    }
}
