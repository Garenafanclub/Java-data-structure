package com.RecursionQ.Array;

import java.util.Arrays;
public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,1};
        Divide(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    private static void Divide(int[] arr , int s , int e)
    {
        if(s>=e) return;
        int mid = s + (e-s)/2;
        Divide(arr,s,mid);
        Divide(arr,mid+1,e);
        MergeSortINplaceSort(arr,s,mid,e);
    }
    private static void MergeSortINplaceSort(int[] arr, int s, int mid, int e) {
        int[] merge = new int[e - s + 1];
        int i = s;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=e)
        {
            if(arr[i]<=arr[j])
            {
                merge[k] = arr[i];
                i++; k++;
            }else {
                merge[k] = arr[j];
                j++; k++;
            }
        }
        while(i<= mid)
        {
            merge[k] = arr[i];
            i++; k++;
        }
        while(j<= e)
        {
            merge[k] = arr[j];
            j++; k++;
        }
        for(int x = 0,z=s;x<merge.length;x++,z++)
        {
             arr[z] = merge[x];
        }
    }
}
