package week1.technicalContent2;

import java.util.Scanner;

public class LeapYearCalculator
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = inp.nextInt();

        boolean isLeapYear = false;

        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                isLeapYear = year % 400 == 0;
            }
            else
            {
                isLeapYear = true;
            }
        }

        if (isLeapYear)
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }
}
