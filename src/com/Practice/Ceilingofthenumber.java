package com.Practice;

// Find a smallest number which is >= target element...
public class Ceilingofthenumber
{
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 10;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    private static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid]==target) return arr[mid];
            else if (arr[mid]>target) end  = mid-1;
            else start = mid + 1;
        }
        return arr[start];
    }
}
