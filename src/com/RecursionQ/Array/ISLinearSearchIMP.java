package com.RecursionQ.Array;

import java.util.ArrayList;

public class ISLinearSearchIMP {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 7, 2, 10};
        int target = 7;
        System.out.println(CheckLinearSearch(arr,target,0));
        System.out.println(CheckLinearFromLast(arr,target,arr.length-1));
/*
        CheckAllINDEX(arr,target,0);
        System.out.println(list);
*/
        System.out.println(CheckAllIndex(arr,target,0, new ArrayList<>()));
        System.out.println(CheckAllIndex2(arr,target,0));
    }

/*
    static ArrayList<Integer> list = new ArrayList<>();
    private static void CheckAllINDEX(int[] arr, int target, int i) {
        if(i == arr.length) return;
        if(arr[i] == target) list.add(i);
        CheckAllINDEX(arr,target,i+1);
    }
*/
    // IMPORTANT CONCEPT OF RECURSION....
    private static ArrayList<Integer> CheckAllIndex(int[] arr, int target ,int i , ArrayList<Integer> list)
    {
        if(i == arr.length) return list;
        if(arr[i] == target) list.add(i);
        return CheckAllIndex(arr,target,i+1,list);
    }

    private static int CheckLinearSearch(int[] arr, int target, int i) {
        if(i == arr.length) return -1;  // BASE CONDITION...
        return arr[i] == target ? i : CheckLinearSearch(arr, target, i + 1);
    }
    private static int CheckLinearFromLast(int[] arr , int target , int il)
    {
        if(il == -1) return -1;  // BASE CONDITION...
        return arr[il] == target ? il : CheckLinearFromLast(arr, target, il - 1);
    }

    private static ArrayList<Integer> CheckAllIndex2(int[] arr , int target , int i)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length)
            return list;

        // this will contain answer for that function calls only...
        if(arr[i] == target) {
            list.add(i);
        }

        ArrayList<Integer> insideList = CheckAllIndex2(arr,target,i+1);
        list.addAll(insideList);
        return list;
    }

}