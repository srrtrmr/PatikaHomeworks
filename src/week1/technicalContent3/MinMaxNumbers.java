package week1.technicalContent3;

import java.util.Scanner;

public class MinMaxNumbers
{
    public static void main(String[] args)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner inp = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int count = inp.nextInt();

        for (int i = 1; i <= count; i++)
        {
            System.out.print("Enter number " + i + ": ");
            int number = inp.nextInt();

            if (number < min)
            {
                min = number;
            }

            if (number > max)
            {
                max = number;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
