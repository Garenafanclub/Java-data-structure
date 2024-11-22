package BasicQues;

import java.util.Scanner;

public class ArmstrongNum
{
    public static void main(String [] args)
    {
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        // Find number of digit on a given number...
        int temp = num;
        int digit = 0;
        while(temp != 0)
        {
            final int i = 10;
            temp = temp / i;
            digit++;
        }
        System.out.println(digit);

        int rem = 0;
        int res = 0;
        temp = num;
        while(temp !=0)
        {
            rem = temp %10;
            res = (int) (res + Math.pow(rem,digit));
            temp = temp /10;
        }
        System.out.println(res);
        if(res == num)
            System.out.println("A armstrong number.");
        else
            System.out.println("Not a armstrong number.");
    }
}
// It is mostly used in data security applications.
// To increase the strength of algorithm 9 digits, Armstrong number
// is used for encryption and decryption, a length of an Armstrong number can be increased if necessary for security purpose.
