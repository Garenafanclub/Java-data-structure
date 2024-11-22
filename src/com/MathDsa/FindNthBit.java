package com.MathDsa;

import java.util.Scanner;
public class FindNthBit
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = cin.nextInt();
        int[] arr = new int[1000];
        int i = 0;
        while(n>0)
        {
           arr[i] = n%2;
           n = n/2;
           i++;
        }
        for(int j = i-1;j>=0;j--) {
            System.out.print(arr[j]);
        }
        System.out.println();

        System.out.println("Enter the position of which you find the bit");
        int BitFind = cin.nextInt();
        if(arr.length < BitFind)
        {
            System.out.println("0");
        }
        System.out.println(arr[BitFind] & (1<<arr[BitFind] -1));
    }
}
/*
 int number = 182;
	int position = 5;
	int bitMask = 1<<position;

	if((bitMask & number) == 0){
		cout<<"Bit Is Zero";
	}else{
		cout<<"Bit Is One";
	}
 */