package com.ArrayQ;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

import static com.ArrayQ.SelectionSort.swapWithLastIndex;
public class CyclicSort
{
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,1};
        cyclicSorting(arr);
    }

    private static void cyclicSorting(int[] arr) {
        int i = 0;
        while(i<arr.length)
        {
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex])
                swapWithLastIndex(arr,i,correctIndex);
            else
                i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
