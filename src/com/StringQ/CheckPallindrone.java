package com.StringQ;

import java.util.Locale;

public class CheckPallindrone
{
    public static void main(String[] args) {
        String str = "abCcba";
        Boolean check = checkPallin(str);
        System.out.println(check);
    }
    static Boolean checkPallin(String str)
    {
        int start = 0;
        int end = str.length() -1;
        if(str == null || str.length() == 0)
            return true;
        str = str.toLowerCase();
        while(start<end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else
                return false;
        }
        return true;
    }
}
