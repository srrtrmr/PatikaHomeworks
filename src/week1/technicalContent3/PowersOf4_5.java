package week1.technicalContent3;

import java.util.Scanner;

public class PowersOf4_5
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = inp.nextInt();

        printPowerOfNumber(limit,4);
        printPowerOfNumber(limit,5);
    }

    public static void printPowerOfNumber(int limit, int number)
    {
        System.out.println("Power of " + number + ": ");

        for (int i = 1; i <= limit; i *= number)
        {
            System.out.println(i);
        }
    }
}
