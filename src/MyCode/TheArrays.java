package MyCode;
import java.util.Arrays;

public class TheArrays
{
    public static void main(String[] args)
    {
        String[] color = new String[5];
        color[0] = "red";
        color[1] = "yellow";
        System.out.println(Arrays.toString(color));
        for(String s : color)
        {
            System.out.println(s);
        }
        // Be aware of Arrays class because it has lots of utility method.
    }
}
