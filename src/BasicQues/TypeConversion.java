package BasicQues;

import java.util.Scanner;

public class TypeConversion
{
    public static void main(String[] args) {
        int x = 20;
        double y = x;  // upsizing... assigning smaller value into higher value..more precise.
        System.out.println(y);
        /***************************************************************/
        double z = 99.9;
        int w = (int) z;  // downsizing...java doesn't support in case of implicit conversion.
        System.out.println(w);
        /****************************************************************/
        // automatic type promotion in expression.  EXPLICIT TYPE CONVERSION.
        int num = 270;
        byte k = (byte) num;   // 270 % 256 = 14;
        System.out.println(k);
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        System.out.println("Greeting" + " " + s);
    }
}
