package com.Practice;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {18 , 12 , -7 , 3 , 14, 28};
        int startindex = 1;
        int lastindex = 4;
        for(int i=startindex;i<=lastindex;i++)
        {
            if(arr[i] == 3)
                System.out.println("yes is was there");
        }
    }
}
