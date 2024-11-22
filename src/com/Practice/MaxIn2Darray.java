package com.Practice;

public class MaxIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {24,4,1},
                {18,12,3,9},
                {27,39,54,66},
                {18,12}
        };
        int target = 1;
        int ans = max2d(arr,target);
        System.out.println(ans);
    }
    static int max2d(int[][] arr , int target)
    {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            // int[] ints = arr[i];
            for (int j = 0; j < ints.length; j++) {
//                int anInt = ints[j];
                if (ints[j] > max)
                    // max = anInt;
                    max = ints[j];
            }
        }
        return max;
    }
}
