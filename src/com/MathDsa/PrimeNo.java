package com.MathDsa;

public class PrimeNo
{
 /*
    public static void main(String[] args) {
        int n = 37;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + isPrime(i));  // TIME COMPLEXITY IS N*SQRT(N);
        }
    }
    static boolean isPrime(int n)
    {
        int i = 2;
        if(n<=1) return false;
        while(i<=Math.sqrt(n))
        {
            if(n%i == 0) return false;
            else i++;
        }
        return true;
    }
 */

    public static void main(String[] args) {
        int n = 40;
        boolean[] array = new boolean[n+1];
        seive(n,array);
    }

    // false in array means number is prime.
     static void seive(int n, boolean[] array) {
        for(int i = 2;i<=Math.sqrt(n);i++)
        {
            if(!array[i])
            {
                for(int j = i*2;j<=n;j+=i)
                {
                    array[j] = true;
                }
            }
        }
        for(int i = 2;i<=n;i++)
        {
            if(!array[i])
            {
                System.out.print(i + " ");
            }
        }
    }
}
//TIME COMPLEXITY NOW REDUCE TO SQRT(N)*LOG(LOG(N))...
