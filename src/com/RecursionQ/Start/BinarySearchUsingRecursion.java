package com.RecursionQ.Start;

public class BinarySearchUsingRecursion
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 2;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    private static int search(int[] arr, int target, int s, int e) {
        if(s>e) {
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid]==target) return mid;
        return arr[mid] > target ? search(arr, target, s, mid - 1) : search(arr, target, mid + 1, e);
    }
}
