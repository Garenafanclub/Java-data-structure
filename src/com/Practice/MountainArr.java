package com.Practice;

class MountainArr {
    public static void main(String[] args)
    {
        int[] mountainArr = {1,2,4,5,8,9,7,3,0};
        int target = 3;
            int ans =  findSide(target , mountainArr);
            System.out.println(ans);
    }
static int findSide(int target , int[] arr)
        {
        int start = 0;
        int end = arr.length -1;
        while(start<end)
        {
        int mid = start + (end - start)/2;
        if(arr[mid]<target) start = mid + 1;
        else end = mid;
        }
        return search(target,arr,start,end);
        }
static int search(int target , int[] arr,int start ,int end)
        {
        while(start<=end)
        {
        int mid = start + (end - start)/2;
        if(arr[mid]>target) end = mid -1;
        else if(arr[mid]<target) start = mid + 1;
        else return mid;
        }
        return -1;
        }

}