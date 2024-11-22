package com.RecursionQ.String;

public class RemoveAce {
    public static void main(String[] args) {
        String str = "abadsaaaccdababdwq , mayank";
        skipCh("","bcaadcarsa");
        System.out.println(skip("bcasadfalskfaaa"));
        System.out.println(Remove(str));
        System.out.println(startWithApple("avdapplerte"));
    }
    static StringBuilder Remove(String str)
    {
        StringBuilder newS = new StringBuilder();
        int i = 0;
        while(i<str.length())
        {
            if(str.charAt(i) == 'a') {
                i++;
            }
            else {
                newS.append(str.charAt(i));
                i++;
            }
        }
        return newS;
    }

    static void skipCh(String newS , String str)
    {
        if(str.isEmpty())
        {
            System.out.println(newS);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a')
            skipCh(newS,str.substring(1));
        else
            skipCh(newS + ch,str.substring(1));
    }

    static String skip(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a')
            return skip(str.substring(1));
        else
            return ch + skip(str.substring(1));
    }
    static String startWithApple(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }
        char ch = str.charAt(0);
        if(str.startsWith("apple"))   // new case  startsWith("app") && !startsWith("apple")
        {
            return startWithApple(str.substring(5));
        }
        else return ch + startWithApple(str.substring(1));
    }
}
