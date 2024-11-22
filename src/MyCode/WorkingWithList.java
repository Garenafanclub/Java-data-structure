package MyCode;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList
{
    public static void main(String[] args)
    {
       List<String> color = new ArrayList<>();
       color.add("Orange");
       color.add("yellow");
//       color.add(1);
//       color.add(new Object());
        System.out.println(color.contains("yellow"));
        System.out.println(color.contains(("red")));
        System.out.println(color.size());
        System.out.println(color);

        for(String s : color)
        {
            System.out.println(s);
        }

    }
}
