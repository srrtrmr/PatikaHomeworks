package week1.technicalContent3;

import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inp.nextInt();

        int sum = 0;

        while (number != 0)
        {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
