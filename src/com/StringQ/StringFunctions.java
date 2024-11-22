package com.StringQ;

import java.util.Arrays;

public class StringFunctions
{
    public static void main(String[] args) {
        String name = "Mayank Bansal";
        System.out.println(name.length());
        System.out.println(name.hashCode());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.charAt(0));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("      Mayank      ".strip());
        System.out.println(name.indexOf('a'));
    }
}
