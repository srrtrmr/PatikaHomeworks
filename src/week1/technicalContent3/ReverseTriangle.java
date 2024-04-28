package week1.technicalContent3;

import java.util.Scanner;

public class ReverseTriangle
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = inp.nextInt();

        for (int r = number; r >= 1; r--)
        {
            for (int c = r; c >= 1; c--)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
