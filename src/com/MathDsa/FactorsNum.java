package com.MathDsa;

import java.util.ArrayList;

public class FactorsNum {
    public static void main(String[] args) {
        int a = 36;
        Factors1(a);
        System.out.println();
        Factors3(a);
        System.out.println();
        // TIME COMPLEXITY IS N AND SPACE IS O(1)...
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                System.out.print(i + " ");
        }
    }

    // BOTH TIME AND SPACE COMPLEXITY IS SQRT(A)...
    private static void Factors3(int a) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                if (a / i == i) System.out.print(i + " ");
                else {
                    System.out.print(i + " ");
                    list.add(a / i);
                }
            }
        }
        for (int j = list.size() - 1; j >= 0; j--) {
            System.out.print(list.get(j) + " ");
        }

    }

    // TIME COMPLEXITY IS SQRT(N) and SPACE COMPLEXITY IS CONSTANT...O(1)
    private static void Factors1(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                if (n / i == i) System.out.print(i + " ");
                else {
                    System.out.print(i + " " + n / i + " ");  // WHAT IF WE WANT TO PRINT IN ASCENDING ORDER.
                }
            }
        }
    }
}
