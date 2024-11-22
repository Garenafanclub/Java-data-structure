package com.ArrayQ;

import java.util.Arrays;
// 2d array is sorted in row and col wise...

public class BinarySearch2D
{
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {11,25,35,42},
                {28,29,37,49},
                {33,34,38,50},
        };
        int target = 33;
        System.out.println(Arrays.toString(Search2d(arr, target)));
    }

    private static int[] Search2d(int[][] arr, int target) {
        int row = 0;
        int col = arr.length -1;
        while(row<arr.length && col>=0)
        {
            if(arr[row][col] == target) return new int[]{row,col};
            else if (arr[row][col]>target) {
                   col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
