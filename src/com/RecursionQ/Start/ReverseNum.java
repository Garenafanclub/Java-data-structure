package com.RecursionQ.Start;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 1234;
        int digit = (int)Math.log10(n) + 1; // FIND NUMBER OF DIGIT IN A GIVEN NUMBER...
        System.out.println(RevNum(n,digit));
    }

    private static int RevNum(int n, int digit) {
        if(n%10 == n)
        {
            return n;
        }
        return (n%10) * (int)Math.pow(10,digit-1) + RevNum(n/10,digit-1);
    }
}
