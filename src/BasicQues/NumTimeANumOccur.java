package BasicQues;

import java.util.Scanner;

public class NumTimeANumOccur
{
    public static void main(String[] args) {
        int n = 535343;
        int temp = n;
        byte count = 0;
        while(temp != 0)
        {
          int res = temp%10;
            if(res == 3)
            {count++;}
            temp = temp /10;
        }
        System.out.println(count);
    }
}

//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        int n = cin.nextInt();
//        int arr[] = new int[n];
//        for(int i = 0;i<n;i++)
//        {
//          arr[i] = cin.nextInt();
//        }
//        System.out.print("[");
//        for(int i = 0;i<n;i++)
//        {
//            System.out.print(" " + arr[i] + " ");
//        }
//        System.out.print("]");
//        int count= 0;
//        for(int i = 0;i<n;i++)
//        {
//           if(arr[i] == 7)
//               count++;
//        }
//        System.out.println();
//        System.out.println(count);
//    }
