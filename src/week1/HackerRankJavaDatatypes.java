package week1;

import java.util.Scanner;

public class HackerRankJavaDatatypes
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int count = inp.nextInt();

        for(int i = 0; i < count; i++)
        {
            try
            {
                long value = inp.nextLong();

                System.out.println(value + " can be fitted in:");

                if(value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE)
                {
                    System.out.println("* byte");
                }

                if(value >= Short.MIN_VALUE && value <= Short.MAX_VALUE)
                {
                    System.out.println("* short");
                }

                if(value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE)
                {
                    System.out.println("* int");
                }

                System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(inp.next()+" can't be fitted anywhere.");
            }
        }
    }
}
