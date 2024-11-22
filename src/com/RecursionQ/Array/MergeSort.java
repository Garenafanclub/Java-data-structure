package com.RecursionQ.Array;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
          int[] arr = {3,4,2,6,1,5};
          int[] ans = Sort(arr);
          System.out.println(Arrays.toString(ans));
    }
    private static int[] Sort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = Sort(Arrays.copyOfRange(arr,0,mid));  // WE CREATE A NEW ARRAY AND USE THIS FOR FURTHER OPERATION...
        int[] right = Sort(Arrays.copyOfRange(arr,mid,arr.length));

        return Merge(left,right);
    }

    private static int[] Merge(int[] left, int[] right) {
         int[] mix = new int[left.length + right.length];
         int i = 0;
         int j = 0;
         int k = 0;
         while(i<left.length && j< right.length)
         {
             if(left[i] < right[j])
             {
                 mix[k] = left[i];
                 i++;
             }
             else{
                 mix[k] = right[j];
                 j++;
             }
             k++;
         }
         while(i<left.length)
         {
             mix[k] = left[i];
             i++;
             k++;
         }
         while(j<right.length)
         {
             mix[k] = right[j];
             j++;
             k++;
         }
         return mix;
    }
}
