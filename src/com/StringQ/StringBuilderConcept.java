package com.StringQ;

public class StringBuilderConcept
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<26;i++)
        {
            char ch = (char)('a' + i);
            sb.append(ch);
        }
        sb.deleteCharAt(3);
        System.out.println(sb);
    }
}
