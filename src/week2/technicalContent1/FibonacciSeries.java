package week2.technicalContent1;

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inp.nextInt();
        int result = fibonacci(number);
        System.out.println(result);
    }

    public static int fibonacci(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
