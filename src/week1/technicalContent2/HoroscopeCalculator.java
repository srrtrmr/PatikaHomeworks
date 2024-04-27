package week1.technicalContent2;

import java.util.Scanner;

public class HoroscopeCalculator
{
    public static void main(String[] args)
    {
        int month, day;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your birth month: ");
        month = inp.nextInt();
        System.out.print("Enter your birth day: ");
        day = inp.nextInt();

        if ((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 19))
        {
            System.out.println("Capricorn");
        }
        else if ((month ==  1 && day >= 20 && day <= 31) || (month ==  2 && day >= 1 && day <= 17))
        {
            System.out.println("Aquarius");
        }
        else if ((month ==  2 && day >= 18 && day <= 29) || (month ==  3 && day >= 1 && day <= 19))
        {
            System.out.println("Pisces");
        }
        else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19))
        {
            System.out.println("Aries");
        }
        else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20))
        {
            System.out.println("Taurus");
        }
        else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20))
        {
            System.out.println("Gemini");
        }
        else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22))
        {
            System.out.println("Cancer");
        }
        else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22))
        {
            System.out.println("Leo");
        }
        else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22))
        {
            System.out.println("Virgo");
        }
        else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
        {
            System.out.println("Libra");
        }
        else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
        {
            System.out.println("Scorpio");
        }
        else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
        {
            System.out.println("Sagittarius");
        }
        else
        {
            System.out.println("Invalid date");
        }
    }
}
