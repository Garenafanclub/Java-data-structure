package com.RecursionQ.Start;

public class PallindroneProg {
/*
    public static void main(String[] args) {
        System.out.println(CheckPallin(121));
    }
    static boolean CheckPallin(int n)
    {
        // Program to convert int to int array...
//      int[] digits = Integer.toString(n).chars().map(c -> c-'0').toArray();
        char[] digits = String.valueOf(n).toCharArray();
        int s = 0;
        int e = digits.length-1;
        while(s<=e)
        {
            if(digits[s] == digits[e])
            {
                s++; e--;
            }
            else
                return false;
        }
        return true;
    }
}
// int number = 12345;
//char[] digits = String.valueOf(number).toCharArray();
*/
public static void main(String[] args) {
        int n = 1221;
        int digit = (int)Math.log10(n) + 1; // FIND NUMBER OF DIGIT IN A GIVEN NUMBER...
        System.out.println(RevNum(n,digit));

        System.out.println(CheckPalin(n,digit));
    }

    private static int RevNum(int n, int digit) {
        if(n%10 == n)
        {
            return n;
        }
        return (n%10) * (int)Math.pow(10,digit-1) + RevNum(n/10,digit-1);
    }
    static boolean CheckPalin(int n , int digit)
    {
        return n == RevNum(n,digit);
    }
}

