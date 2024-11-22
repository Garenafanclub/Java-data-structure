package com.RecursionQ.Start;

public class SumOFProd {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(ProdOFDigit(n));
    }

    private static int ProdOFDigit(int n) {
        if(n%10 == n)
        {
            return n;
        }
        return (n%10) * ProdOFDigit(n/10);
    }
}
