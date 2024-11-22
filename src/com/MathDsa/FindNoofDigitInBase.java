package com.MathDsa;

import java.util.Scanner;

public class FindNoofDigitInBase
{
        public static void main(String[] args) {

/*
            Scanner cin = new Scanner(System.in);
            int n = cin.nextInt();
            int[] arr = new int[1000];
            int i = 0;
            while(n>0)
            {
                arr[i] = n%2;
                n = n/2;
                i++;
            }
            System.out.println(i);
*/
/*
            Scanner cin = new Scanner(System.in);
            int n = cin.nextInt();
            int count = 0;
            while(n>0)
            {
                n = n>>1;
                count++;
            }
            System.out.println(count);
*/
            int num = 10;
            int base = 2;
            int ans = (int)(Math.log10(num)/ Math.log10(base)) + 1;    // log a base b = log a base x / log b base x;
            System.out.println(ans);
        }
}
