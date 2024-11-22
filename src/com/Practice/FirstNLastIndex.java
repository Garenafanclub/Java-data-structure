package com.Practice;

// Two pointer approach...

public class FirstNLastIndex
{
    public static void main(String[] args) {
        int[] arr = {2,3,7,7,7,7,8,9};
        int i = 0;
        int target = 7;
        int j = arr.length-1;
        while(i<=j)
        {
            if(arr[i]==target) break;
            i++;
        }
        while(j>=0)
        {
            if(arr[j]==target) break;
            j--;
        }
        System.out.println(i + " " + j);
    }
}
