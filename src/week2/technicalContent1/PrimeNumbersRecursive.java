package week2.technicalContent1;

import java.util.Scanner;

public class PrimeNumbersRecursive
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = inp.nextInt();

        boolean result = isPrime(number, 2);

        if (result == true)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not prime");
        }
    }

    static boolean isPrime(int n, int i)
    {
        if (n <= 2)
        {
            return n == 2;
        }
        if (n % i == 0)
        {
            return false;
        }
        if (i * i > n)
        {
            return true;
        }

        return isPrime(n, i + 1);
    }
}
