package BasicQues;

import java.util.Scanner;

public class FibonacciSeri extends Thread
{
    public static void main(String[] args) throws InterruptedException {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int sum = 0;
        int first = 0;
        int next = 1;
        try {
            Thread.sleep(200);
        }catch (Exception e){}
        System.out.print(first+" " +next);
        for(int i = 0;i<n;i++)
        {
          sum = first + next;
          first = next;
          next = sum;
          Thread.sleep(200);
          System.out.print(" " + sum);
        }
    }
}
