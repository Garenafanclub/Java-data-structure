package BasicQues;

import java.util.Scanner;

public class SwitchLamdaImp
{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        switch (n) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Keep going");
        }


        // Input a number and print all the factors of that number (use loops).
           for(int i = 1 ; i < n;i++)
           {
               if(n % i == 0)
                   System.out.println(i + " is a factor of " + n);
           }

        // Take integer inputs till the user enters 0 and print the largest number from all.
         int num = cin.nextInt(); int Maxi=0;
         while(num!=0)
         {
             num = cin.nextInt();
             if(num>Maxi)
                 Maxi = num;
         }
        System.out.println(Maxi);
    }
}
