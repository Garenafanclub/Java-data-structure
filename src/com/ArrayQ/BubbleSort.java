package com.ArrayQ;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        boolean swapped = false;
        int[] arr = {1, 2,3,4,5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                System.out.println("Array is already sorted.");
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// if you did not swap for a particular value of i it means it already sorted...
