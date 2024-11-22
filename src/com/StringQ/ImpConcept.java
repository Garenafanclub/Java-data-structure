package com.StringQ;

public class ImpConcept
{
    public static void main(String[] args) {

        String series = "";
        for(int i = 0;i<26;i++)
        {
            char ch = (char)('a' + i);
            series += ch;
        }
        System.out.println(series);
    }
}

// IN THIS CODE THE PERFORMANCE IS VERY LESS ,EVERY TIME IT MAKE NEW OBJECT AND OLD OBJECT REMIAN IN MEMORY..
// LIKE a,ab,abc,abcd,abcde,abcdef,abcdefg,abcdefgh,abcdefghi,abcdefghij,...........and so on upto z...
// TIME COMPLEXITY IS O(n^2)..

// So TO IMPROVE THE PERFORMANCE AND USE MEMORY IN EFFICIENT MANNER..
// STRING BUILDER CLASS IS AVAILABLE...
// as it does not make new object rather than this will update the object or you can say just use older object and
// update with new object... therefore no need to make new object every rotation...
// just one time object is make and updated till loop is over..
// therefore better memory management...