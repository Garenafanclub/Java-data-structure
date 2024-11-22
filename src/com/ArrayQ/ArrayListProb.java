package com.ArrayQ;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProb
{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(12);
        list.add(14);
        list.add(13);
        list.add(11);
        list.add(10);
        list.set(1,20);
        list.remove(2);
        System.out.println(list);
        for(int i = 0;i<5;i++)
        {
            list.add(cin.nextInt());
        }
        for(int i = 0 ; i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
