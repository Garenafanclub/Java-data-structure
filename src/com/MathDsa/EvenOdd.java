package com.MathDsa;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        if((n&1) == 1) System.out.println("Number is odd");
        else System.out.println("Number is even");
    }
}