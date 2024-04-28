package week1.technicalContent3;

import java.util.Scanner;

public class ExponentialNumber
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter base number: ");
        int baseNumber = inp.nextInt();
        System.out.println("Enter power: ");
        int power = inp.nextInt();

        int total = 1;

        for (int i = 1; i <= power; i++)
        {
            total *= baseNumber;
        }

        System.out.println("Result: " + total);
    }
}
