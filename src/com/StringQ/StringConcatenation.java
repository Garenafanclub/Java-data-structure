package com.StringQ;

import java.util.ArrayList;
public class StringConcatenation
{
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("A" + "B");
        System.out.println("a" + 1);
        System.out.println("MAYANK" + new ArrayList<>());
        System.out.println(new ArrayList<>() + "" + new Integer(23));
    }
}
