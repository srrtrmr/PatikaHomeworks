package week1.technicalContent3;

import java.util.Scanner;

public class HackerRankLoops
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
