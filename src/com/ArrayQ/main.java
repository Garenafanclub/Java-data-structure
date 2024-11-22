package com.ArrayQ;

public class main{
   static int fun(int a , int b)
    {
        if(b==0) return 1;
        int ans = fun(a,b/2);
        ans = ans*ans;
        if(b % 2 != 0)  ans=(ans*a);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fun(2,10));
    }
}
