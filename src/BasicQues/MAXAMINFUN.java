package BasicQues;

import java.util.Scanner;

public class MAXAMINFUN
{
    static int checkMax(int a , int b , int c)
    {
        int max = a;
        if(b>max) max = b;
        if(c>max) max = c;
        return max;
    }
    static int checkMin(int a , int b , int c)
    {
        int min = a;
        if(b<min) min = b;
        if(c<min) min = c;
        return min;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int MAX = checkMax(a , b , c);
        System.out.println(MAX);
        int MIN =  checkMin(a , b, c);
        System.out.println(MIN);
    }
}
