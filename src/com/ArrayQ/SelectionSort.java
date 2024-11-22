package com.ArrayQ;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr = {2,4,1,5,3};
        for(int i = 0;i<arr.length;i++)
        {
            int lastIndex = arr.length - i-1;
            int getMax = maxFun(arr,0,lastIndex);
            swapWithLastIndex(arr,getMax,lastIndex);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swapWithLastIndex(int[] arr,int getMax , int lastIndex) {
       int temp = arr[getMax];
       arr[getMax] = arr[lastIndex];
       arr[lastIndex] = temp;
    }

   private static int maxFun(int[] arr,int start ,int last)
    {
        int max = start;
        for(int i = start;i<last;i++)
        {
            if(arr[max]<arr[i]) max = i;
        }
        return max;
    }
}