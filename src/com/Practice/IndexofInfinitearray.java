package com.Practice;


// As array is infinite we don't know about the last element..
// therefore we find the target element within the range and keep increasing our range twice the previous...
public class IndexofInfinitearray
{
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,11,13,15,20,23,30};  // assume to be infinite...
        int target = 11;
        int ans = findingRange(arr,target);
        System.out.println(ans);
    }
    static int findingRange(int[] arr , int target)
    {
        // first find the range
        int start = 0;
        int end = 1;
        // condition for target to lie in range...
        while(target>arr[end])
        {
            int temp  = end +1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return searchinRange(arr,target,start,end);
    }
    static int searchinRange(int[] arr , int target,int start,int end)
    {
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid]>target) end = mid-1;
            else if (arr[mid]<target) start = mid+1;
            else return mid;
        }
        return -1;
    }
}
