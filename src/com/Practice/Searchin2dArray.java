package com.Practice;

import java.util.Arrays;

public class Searchin2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {24,4,1},
                {18,12,3,9},
                {27,39,54,66},
                {18,12}
        };
        int target = 39;
        int[] ans = search2d(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2d(int[][] arr , int target)
    {
        for(int row = 0;row< arr.length;row++)
        {
            for(int col = 0;col<arr[row].length;col++)
            {
                if(arr[row][col] == target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
