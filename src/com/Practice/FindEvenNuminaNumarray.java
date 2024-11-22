package com.Practice;

public class FindEvenNuminaNumarray
{
    public static void main(String[] args) {
        int[] nums = {12,34,27,6,-7896};
        int count = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(findEvendigit(nums[i]))
                count++;
        }
        System.out.println(count);
    }

    private static boolean findEvendigit(int num) {
        int noofdigit = findNumofDigit(num);
        return noofdigit % 2 == 0;
    }
    static int findNumofDigit(int nums)
    {
        int count = 0;
            while (nums!= 0) {
                count++;
               nums /= 10;
            }
            return count;
    }

//    static int findNumofDigit(int nums)
//    {
//        if(nums<0)
//            nums=nums*-1;
//        return (int)Math.log10(nums) +1;
//    }
}
