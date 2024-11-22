package com.ArrayQ;

import java.util.Scanner;

public class multiArr
{
    public static void main(String[] args) {
              int[][] arr = new int[3][3];
              Scanner cin = new Scanner(System.in);
        for(int row = 0;row<arr.length;row++)
        {
            for(int col = 0;col<arr[row].length;col++)
            {
                arr[row][col] = cin.nextInt();
            }
        }
              for(int row = 0;row<arr.length;row++)
              {
                  for(int col = 0;col<arr[row].length;col++)
                  {
                      System.out.print(arr[row][col] + " ");
                  }
                  System.out.println();
              }

     }
}

// for(int z : arr)
//{
//   for(int k : z)
//        {
//            System.out.println()
//        }
//}

// System.out.println(Arrays.toString(arr[row]));
