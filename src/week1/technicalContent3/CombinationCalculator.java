package week1.technicalContent3;

import java.util.Scanner;

public class CombinationCalculator
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = inp.nextInt();
        System.out.print("Enter r: ");
        int r = inp.nextInt();

        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n - r);
        int result = a / (b * c);

        System.out.println("Combination: " + result);
    }

    public static int factorial(int number)
    {
        int total = 1;

        for (int i = 1; i <= number; i++)
        {
            total *= i;
        }

        return total;
    }
}
