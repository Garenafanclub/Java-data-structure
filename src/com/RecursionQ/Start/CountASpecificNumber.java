package com.RecursionQ.Start;

public class CountASpecificNumber {
    public static void main(String[] args) {
        System.out.println(CountZeroes(203087002));
    }

    private static int CountZeroes(int n) {
        return helper(n,0);
    }

    private static int helper(int n, int count) {
        if(n==0)
            return count;
        if(n%10 == 0)
        {
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }

}
