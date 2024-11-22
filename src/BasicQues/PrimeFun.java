package BasicQues;
import java.util.Scanner;

public class PrimeFun
{
    public static boolean checkPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i = 2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = cin.nextInt();
        boolean isPrime = checkPrime(num);
        if(isPrime)
            System.out.println(num+"number is prime number.");
        else
            System.out.println(num+"number is not a prime number.");
    }
}
