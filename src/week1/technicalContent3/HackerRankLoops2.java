package week1.technicalContent3;

import java.util.Scanner;

public class HackerRankLoops2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for(int i = 0; i < count; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int res = a;
            for (int j = 0; j < n; j++)
            {
                res += (int)(Math.pow(2, j) * b);
                System.out.print(Integer.toString(res)  + ' ');
            }

            System.out.print('\n');
        }

        in.close();
    }
}
