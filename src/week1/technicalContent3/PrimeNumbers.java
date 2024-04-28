package week1.technicalContent3;

import java.util.Scanner;

public class PrimeNumbers
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = inp.nextInt();

        for (int i = 1; i <= number; i++)
        {
            boolean asal = isPrime(i);

            if (asal)
            {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
