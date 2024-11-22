package BasicQues;

import java.util.*;
public class FactorialProg {
    static int FindFactorial(int n)
    {
        if(n==0)
            return 1;
        else return (n * FindFactorial(n - 1));
    }
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n= cin.nextInt();
        int result =  FindFactorial(n);
        System.out.println(result);
    }
}
