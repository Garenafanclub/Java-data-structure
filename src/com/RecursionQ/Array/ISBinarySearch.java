package com.RecursionQ.Array;

public class ISBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,9};
        int target = 10;
        System.out.println(CheckBinarySearch(arr,0,arr.length-1 , target));
    }

    private static int CheckBinarySearch(int[] arr, int s, int e , int target) {
        if(s>e)
            return -1;
        int mid = s + (e-s)/2;
        if(arr[mid] == target) return mid;
        return arr[mid] > target ? CheckBinarySearch(arr, s, mid - 1, target) : CheckBinarySearch(arr, mid + 1, e, target);
    }
}
