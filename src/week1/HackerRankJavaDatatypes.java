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
                long x = inp.nextLong();

                System.out.println(x + " can be fitted in:");

                if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                {
                    System.out.println("* byte");
                }

                if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                {
                    System.out.println("* short");
                }

                if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
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
