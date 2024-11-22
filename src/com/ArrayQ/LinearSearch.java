package com.ArrayQ;

import java.util.Arrays;

public class LinearSearch
{
    public static void main(String[] args) {
        int[] arr = {10, 20, 3, 4, 5, 141, 52};
        int target = 141;
        int index = searchIndex(arr, target);
        System.out.println(index);
        boolean value = searchValue(arr, target);
        System.out.println(value);
        String str = "Mayank";
        System.out.println(Arrays.toString(str.toCharArray()));
        char ch = 'n';
        System.out.println(searchString(str, ch));

    }
    static int searchIndex(int arr[] , int target)
    {
        if(arr.length == 0)
            return -1;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
    static boolean searchValue(int arr[] , int target)
    {
        if(arr.length == 0)
            return false;

        for(int i : arr)
        {
            if(i == target)
                return true;
        }
        return false;
    }
    static boolean searchString(String str , char ch)
    {
      if(str.length() == 0)
          return false;
        for(int i = 0;i<str.length();i++)
        {
            if(ch == str.charAt(i))  // for(char ch : str.toCharArray())
            {
                return true;
            }
        }
        return false;
    }
}
