package com.Practice;

public class HCFof2Number {
        public static void main (String[]args)
        {
            int num1 = 2, num2 = 6, hcf;
            hcf = getHCF (num1, num2);
            System.out.println ("The HCF: " + hcf);
        }
        static int getHCF(int num1, int num2)
        {
            if (num1 == 0)
                return num2;

            if (num2 == 0)
                return num1;

            if (num1 == num2)
                return num1;

            if (num1 > num2)
                return getHCF (num1 - num2, num2);

            return getHCF (num1, num2 - num1);
        }
    }

/*
    public static void main(String[] args)
    {
       int num1 = 12;
       int num2 = 36;
       int hcf=0;
       for(int i = 0;i<num1 || i<num2;i++)
       {
          if(num1%i==0 && num2%i==0)
          {
            hcf = i;
          }
       }
       System.out.println(hcf);
    }
 */