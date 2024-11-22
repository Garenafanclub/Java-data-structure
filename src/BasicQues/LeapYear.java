package BasicQues;
import java.util.Scanner;
public class LeapYear
{
    public static boolean checkLeap(int n) {
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                return n % 400 == 0;
            }
            return false;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        boolean isLeapYear = checkLeap(num);
        if(isLeapYear)
            System.out.println("IS A LEAP YEAR");
        else
            System.out.println("IS NOT A LEAP YEAR");
    }
}
