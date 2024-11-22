package com.MathDsa;

import java.util.Scanner;

public class NoOfSetBit {
    public static void main(String[] args) {
         Scanner cin = new Scanner(System.in);
         int num = cin.nextInt();
         System.out.println(Integer.toBinaryString(num));
         int count = 0;
         while(num>0)
         {
             count++;
             num = num & num - 1; // n = n - (n & -n)  // find first RSB and than - with -n..
         }
        System.out.println(count);
    }
}
