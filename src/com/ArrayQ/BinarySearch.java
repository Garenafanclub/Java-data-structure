package com.ArrayQ;

import java.util.Arrays;
import java.util.Collections;

// Note: It is really important to sort array first...
// how to find whether the array is sorted in ascending or descending order...
public class BinarySearch
{
    public static void main(String[] args) {
        Integer[] arr = {19,20,32,43,2,4,3,342,64,43};
        Arrays.sort(arr, Collections.reverseOrder());
        int search = 64;

        boolean isAsc;
        if(arr[0]<arr[arr.length-1]) isAsc = true;
        else isAsc = false;
        if(isAsc) {
            int ans = binarySearch(arr, search);
            System.out.println(ans);
        }
        else {
            int ans2 = binarySearchAgnostic(arr, search);
            System.out.println(ans2);
        }
    }
    static int binarySearch(Integer[] arr , int target)
    {
        int start = 0;
        int end = arr.length -1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] > target) end = mid - 1;
            else if (arr[mid] < target) start = mid + 1;
            else return mid;
        }
        return -1;
    }
    static  int binarySearchAgnostic(Integer[] arr , int target)
    {
        int start = 0;
        int end = arr.length -1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid]>target) start = mid +1;
            else if(arr[mid]<target) end = mid -1;
            else return mid;
        }
       return -1;
    }
}
