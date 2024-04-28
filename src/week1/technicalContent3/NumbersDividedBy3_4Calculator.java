package week1.technicalContent3;

import java.util.Scanner;

public class NumbersDividedBy3_4Calculator
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inp.nextInt();

        int sum = 0, count = 0;

        for (int i = 0 ; i <= number; i++)
        {
            if (i % 3 == 0 && i % 4 == 0)
            {
                sum = sum + i;
                count++;
                // System.out.println(i);
            }
        }
        System.out.println("Average of numbers divided by 3 & 4: " + ((double) sum / count));
    }
}
