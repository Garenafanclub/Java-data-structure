package com.ArrayQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class multiarrlist
{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0;i<3;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++)
            {
                list.get(i).add(cin.nextInt());
            }
        }
        System.out.println(list);
    }
}