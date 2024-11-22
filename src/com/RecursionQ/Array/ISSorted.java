package com.RecursionQ.Array;

public class ISSorted {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7};
        System.out.println(CHECKSorted(arr,0));
    }

    private static boolean CHECKSorted(int[] arr, int index) {
        if(index == arr.length-1)
        {
            return true;
        }
        return arr[index] < arr[index + 1] && CHECKSorted(arr,index+1);
    }
}
