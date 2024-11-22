package com.MathDsa;

import java.util.Scanner;

public class NoisPowerof2
{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int count = 0;
        while(n>0)
        {
            n = n>>1;
            if(n == 1) count++;
        }
        if(count == 1)
            System.out.println("Yes it is power of 2");
        else
            System.out.println("No");

//        boolean ans = (n & (n-1)) == 0;
//        if(n == 0)
//            System.out.println(false);
//       else System.out.println(ans);

//        int result = (int)(Math.log(n) / Math.log(2));
//        boolean ans = (n & (1<<result)) == n;
//        System.out.println(ans);
    }
}
