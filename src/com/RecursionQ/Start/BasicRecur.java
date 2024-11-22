package com.RecursionQ.Start;

public class BasicRecur
{
    public static void main(String[] args) {
          print(1);
    }
    private static void print(int n) {
        if(n>5)  // this is the base condition where recursion will stop making function calls.
        {
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
