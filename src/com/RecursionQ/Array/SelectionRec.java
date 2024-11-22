package com.RecursionQ.Array;

import java.util.Arrays;

public class SelectionRec {
    public static void main(String[] args) {
        int[] arr = {3,6,1,2,4};
        SelectionRecur(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void SelectionRecur(int[] arr, int n, int i, int max) {
        if(n == 0) return;
        if(i<n)
        {
            if(arr[i]>arr[max]) {
                SelectionRecur(arr, n, i + 1, i);
            }
            else {
                SelectionRecur(arr, n, i + 1, max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[n-1];
            arr[n-1] = temp;
            SelectionRecur(arr, n - 1, 0,0);
        }
    }
}
