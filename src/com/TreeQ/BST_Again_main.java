package com.TreeQ;

import java.util.Scanner;

public class BST_Again_main {
    public static void main(String[] args) {
        BST_Again obj = new BST_Again();
        try (Scanner cin = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter a value to insert into the BST (or type 'exit' to finish):");
                String str = cin.nextLine();

                if (str.equalsIgnoreCase("exit")) {
                    break;
                }
                try {
                    int value = Integer.parseInt(str);
                    obj.insert(value);
                    System.out.println("Inserted " + value + " into the BST.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input");
                }
            }
            System.out.println("BST STRUCTURE");
            obj.display();
            System.out.println("Maximum value of BST: " + obj.max_Value());
            obj.pre_Order();
            System.out.println();
            obj.delete(50);
            obj.display();
        }
    }
}
