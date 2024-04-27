package week1.technicalContent2;

import java.util.Scanner;

public class HackerRankIfElse
{
    public static void main(String[] args)
    {
        int number;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a number");
        number = inp.nextInt();

        if (number%2 != 0 )
        {
            System.out.println("Weird");
        }

        if (number%2 == 0 ) {
            if (number >= 2 && number <= 5)
            {
                System.out.println("Not Weird");
            }
            else if (number >= 6 && number <= 20)
            {
                System.out.println("Weird");
            }
            else if (number > 20)
            {
                System.out.println("Not Weird");
            }
        }
    }
}
