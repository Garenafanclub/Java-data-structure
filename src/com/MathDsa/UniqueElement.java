package com.MathDsa;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,5,4,3,3,2,4};
        int ans = 0;
        for(int i = 0;i<arr.length;i++)
        {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}
// IT IS ONLY POSSIBLE WHEN ELEMENTS REPEAT TWICE TIME AND ONLY ONE ELEMENT IS UNIQUE THERE..
