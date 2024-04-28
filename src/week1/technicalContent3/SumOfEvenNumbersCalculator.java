package week1.technicalContent3;

import java.util.Scanner;

public class SumOfEvenNumbersCalculator
{
    public static void main(String[] args)
    {
        int number;
        int total = 0;

        Scanner inp = new Scanner(System.in);

        do
        {
            System.out.print("Enter number: ");
            number = inp.nextInt();

            if (number % 2 == 0)
            {
                total += number;
            }
        } while (number % 2 != 1);

        System.out.println("Total of even numbers: " + total);
    }
}
