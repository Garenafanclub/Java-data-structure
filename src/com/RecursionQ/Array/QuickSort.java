package com.RecursionQ.Array;

//HAVING DOUBT.........
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
         int[] arr = {10,3,11,7,9};
         Sort(arr,0,arr.length-1);
         System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr , int low , int high)
    {
        if(low>=high)
        {
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int piv = arr[mid];

        if(s<=e) {
            while (arr[s] < piv) {
                s++;
            }
            while (arr[e] > piv) {
                e--;
            }
            if (s<=e)
            {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++; e--;
            }
            // pivot element at the correct position..
            Sort(arr, low, e);
            Sort(arr, s, high);
        }
    }
}
