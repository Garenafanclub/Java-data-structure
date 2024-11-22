package com.MathDsa;

import java.util.Scanner;

public class FIndNthMagicNo
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
        int ans = 0;
        for(int j = 0;j<=i;j++)
        {
            ans = ans + arr[j]* Math.pow(5,j);
        }
        System.out.println(ans);
*/
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int base = 5;
        int ans = 0;
        while(n>0)
        {
            int last = n&1;
            n = n>>1;
            ans = ans + last*base;
            base = base*5;
        }
        System.out.println(ans);

    }
}

/*
if 1 = 001 == 5
2 = 010 == 25
3 = 011 = 30
 */
