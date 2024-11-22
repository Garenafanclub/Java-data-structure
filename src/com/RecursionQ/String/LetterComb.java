package com.RecursionQ.String;

import java.util.ArrayList;
import java.util.List;

public class LetterComb {
    public static void main(String[] args) {
        String str = "382";
        String[] phone_map = new String[] {" "," ", "abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if
        (str.length() == 0)
        {
            System.out.println("[]");
        }
        System.out.println(seqComb("",str,phone_map,new ArrayList<>()));
        System.out.println(seqCombCount("",str,phone_map));
    }
    static ArrayList<String> seqComb(String p , String up, String[] phone_map,ArrayList<String> list)
    {
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }
        String key = phone_map[up.charAt(0) - 48];
        for(int i = 0;i<key.length();i++)
        {
            seqComb(p+key.charAt(i),up.substring(1),phone_map,list);
        }
        return list;
    }
    static int seqCombCount(String p , String up, String[] phone_map)
    {
        if(up.isEmpty())
        {
            return 1;
        }
        String key = phone_map[up.charAt(0) - 48];
        int count = 0;
        for(int i = 0;i<key.length();i++)
        {
            count = count + seqCombCount(p+key.charAt(i),up.substring(1),phone_map);
        }
        return count;
    }

}
