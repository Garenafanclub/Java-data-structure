package com.RecursionQ.String;

import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
       String str = "abc";
        subseq("",str);
        System.out.println(subSeqRet("","abc",new ArrayList<>()));
        System.out.println(subSeq("","abc"));
    }
    static void subseq(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ ch , up.substring(1));
        subseq(p,up.substring(1));
    }
    static ArrayList<String> subSeqRet(String p , String up, ArrayList<String> list)
    {
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }
         char ch = up.charAt(0);
         subSeqRet(p+ch,up.substring(1),list);
         // subSeqRet(p + (ch+0),up.substring(1),list);
         subSeqRet(p,up.substring(1),list);
         return list;
    }
    static ArrayList<String> subSeq(String p , String up)
    {
        // return arraylist but making inside the function...
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeq(p+ch,up.substring(1));
        ArrayList<String> right = subSeq(p , up.substring(1));
        left.addAll(right);
        return left;
    }
}
