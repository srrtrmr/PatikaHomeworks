package week1.technicalContent2;

import java.util.Scanner;

public class SortingThreeNumbers
{
    public static void main(String[] args)
    {
        int a, b, c;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        a = inp.nextInt();
        b = inp.nextInt();
        c = inp.nextInt();

        if (a > b && a > c)
        {
            if (b > c)
            {
                System.out.println(a + " > " + b + " > " + c);
            }
            else if (c > b)
            {
                System.out.println(a + " > " + c + " > " + b);
            }
            else
            {
                System.out.println(a + " > " + c + " = " + b);
            }
        }
        else if (b > a && b > c)
        {
            if (a > c)
            {
                System.out.println(b + " > " + a + " > " + c);
            }
            else if (c > a)
            {
                System.out.println(b + " > " + c + " > " + a);
            }
            else
            {
                System.out.println(b + " > " + c + " = " + a);
            }
        }
        else if (c > a && c > b)
        {
            if (a > b)
            {
                System.out.println(c + " > " + a + " > " + b);
            }
            else if (b > a)
            {
                System.out.println(c + " > " + b + " > " + a);
            }
            else
            {
                System.out.println(c + " > " + b + " = " + a);
            }
        }
    }
}
