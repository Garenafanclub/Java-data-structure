package com.ArrayQ;

import java.util.Arrays;
import java.util.Scanner;

public class Array1
{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int num : arr)
        {
            System.out.println(num);
        }
        String[] A = new String[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = cin.next();
        }
        System.out.println(Arrays.toString(A));
    }
}
