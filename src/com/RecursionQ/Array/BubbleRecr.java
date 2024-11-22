package com.RecursionQ.Array;

import java.util.Arrays;

public class BubbleRecr {
    public static void main(String[] args) {
        int[] arr = {3,6,1,2,4};
        SortRec(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void SortRec(int[] arr, int n, int i) {
        if(n == 0)
        {
            return;
        }
        if(i<n) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
            SortRec(arr, n, i + 1);
        }
            else {
                SortRec(arr,n-1,0);
            }
        }
    private static  void swap(int[] arr , int i , int z)
    {
        int temp = arr[i];
        arr[i] = arr[z];
        arr[z] = temp;
    }
}
