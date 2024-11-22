package com.StringQ;

public class main
{
    public static void main(String[] args) {
        String name = "Mayank";
        String b = "Mayank";
        System.out.println(b);
        b = "Bansal";
        System.out.println(name);
        System.out.println(b);
        String c = b;
        System.out.println(c);
        b = "Mayank";
        System.out.println(c);

        String str1 = new String("Kunal");
        String str2 = new String("Kunal");

        System.out.println(name == b);
        System.out.println(b == c);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println(str1.charAt(1));
    }
}
