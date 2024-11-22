package com.RecursionQ.Start;

import java.util.Arrays;

public class ConvertINTtoArrayInt {
    public static void main(String[] args)
    {
        int num = 12345;
        String temp = Integer.toString(num);
        int[] numbers = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            numbers[i] =  Character.getNumericValue(temp.charAt(i));
        }

        System.out.println("Variable numbers type: "
                + numbers.getClass().getSimpleName());

        System.out.println("Variable numbers content: "
                + Arrays.toString(numbers));
    }
}
