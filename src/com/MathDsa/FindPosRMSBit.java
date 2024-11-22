package com.MathDsa;

import java.util.Scanner;

public class FindPosRMSBit
{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        System.out.println(num & (-num));
    }
}
