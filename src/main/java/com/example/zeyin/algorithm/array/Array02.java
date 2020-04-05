package com.example.zeyin.algorithm.array;

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
        if(srcArray.length==0|| srcArray[0].length==0){
            return new int[0][0];
        }

        //求矩阵的行数和列数；
        int row1 = srcArray.length;
        int row2 = srcArray[0].length;
        //输出矩阵
        int[][] desArray =new int[row1 +1][row2 +1];
        desArray[0][0]= srcArray[0][0];

        for(int i = 1; i< row1; i++)
            desArray[i][0]= desArray[i-1][0]+ srcArray[i][0];

        for(int j = 1; j< row2; j++)
            desArray[0][j]= desArray[0][j-1]+ srcArray[0][j];

        for(int i = 1; i< row1; i++){
            for(int j = 1; j< row2; j++){
                desArray[i][j]= desArray[i-1][j]+ desArray[i][j-1]- desArray[i-1][j-1]+ srcArray[i][j];
            }
        }

        return desArray;
    }
}
