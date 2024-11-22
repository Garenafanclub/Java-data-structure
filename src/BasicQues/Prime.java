package BasicQues;

import java.util.*;
import java.lang.Math;
public class Prime {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        boolean flag = true;
        for(int i = 2;i<=Math.sqrt(a);i++)   // COMPLEXITY IS REDUCED...NO NEED TO TRAVERSE AT THE END.
        {
            if(a%i ==0)
            {
                flag=false;
                break;
            }
        }
        if(!flag){
            System.out.println("Not a prime number");
        }else{
            System.out.println("prime number");
        }
    }
}
