package com.ArrayQ;


import java.util.Arrays;

import static com.ArrayQ.SelectionSort.swapWithLastIndex;


public class InsertionSort
{
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,3};
        InsertSorting(arr);
    }

    private static void InsertSorting(int[] arr) {
        for(int i= 0;i<arr.length-1;i++)
        {
            for(int j = i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                    swapWithLastIndex(arr,j,j-1);
                else
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
