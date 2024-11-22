package com.Practice;

public class FloorOftheNumber
{
    public static void main(String[] args)
    {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 13;
        int ans = searchgreatest(arr,target);
        System.out.println(ans);
    }

    private static int searchgreatest(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid]==target) return arr[mid];
            else if (arr[mid]>target) end = mid-1;
            else start = mid+1;
        }
        return arr[end];
    }
}
