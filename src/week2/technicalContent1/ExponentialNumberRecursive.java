package week2.technicalContent1;

import java.util.Scanner;

public class ExponentialNumberRecursive
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter base number: ");
        int baseNumber = inp.nextInt();
        System.out.println("Enter power: ");
        int power = inp.nextInt();

        int result = exp(power, baseNumber);
        System.out.println("Result: " + result);
    }

    public static int exp(int pow, int num)
    {
        if (pow < 1)
        {
            return 1;
        }
        else
        {
            return num * exp(pow-1, num) ;
        }
    }
}
