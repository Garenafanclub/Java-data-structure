package com.RecursionQ.Start;

public class SumOfDigit {
    public static void main(String[] args) {
        int n = 1234;
/*
        int last = 0;
        while(n>0)
        {
            last = last + n%10;
            n = n/10;
        }
        System.out.println(last);
*/
        System.out.println(DigitSum(n));
    }
    static int DigitSum(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return (n%10) + DigitSum(n/10);
    }
}
