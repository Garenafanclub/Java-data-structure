package BasicQues;

import java.util.Scanner;

public class UptoX
{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String input = cin.nextLine();
            if (input.equals("x")) break;
            int num = Integer.parseInt(input);
            sum += num;
        }
        System.out.println(sum);
    }
}
