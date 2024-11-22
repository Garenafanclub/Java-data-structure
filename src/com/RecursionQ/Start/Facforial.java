package com.RecursionQ.Start;

public class Facforial {
    public static void main(String[] args) {
        System.out.println(facto(5));
    }

    private static int facto(int n) {
        if(n <= 1)
        {
            return 1;
        }
        return n*facto(n-1); // if you want sum than  return n + facto(n-1);
    }
}
