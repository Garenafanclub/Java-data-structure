package com.RecursionQ.String;

import java.util.ArrayList;

public class PermutationSeq {
    public static void main(String[] args) {
        subseqPer("","abc");
        System.out.println(subseqP("","abc",new ArrayList<>()));
        System.out.println(subseqCount("","abc"));
    }
    static void subseqPer(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0;i<=p.length();i++)
        {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            subseqPer(f+ch+l,up.substring(1));
        }
    }
    static ArrayList<String> subseqP(String p , String up, ArrayList<String> list)
    {
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for(int i = 0;i<=p.length();i++)
        {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            subseqP(f+ch+l,up.substring(1),list);
        }
        return list;
    }
    static int subseqCount(String p , String up)
    {
        if(up.isEmpty())
        {
           return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for(int i = 0;i<=p.length();i++)
        {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            count = count + subseqCount(f+ch+l,up.substring(1));
        }
        return count;
    }
} 
