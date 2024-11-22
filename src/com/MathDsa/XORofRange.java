package com.MathDsa;

import java.util.Scanner;

public class XORofRange {
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Start from: ");
        int a = cin.nextInt();
        System.out.print("End to: ");
        int b = cin.nextInt();
        int ans = xorFun(b) ^ xorFun(a-1);
        System.out.println(ans);
    }
    private static int xorFun(int n) {
        if(n % 4 == 0){
            return n;
        } else if (n%4 == 1) {
            return 1;
        } else if (n%4 == 2) {
            return n+1;
        }
        return 0;
    }
}

