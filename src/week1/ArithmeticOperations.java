package week1;

import java.util.Scanner;

public class ArithmeticOperations
{
    public static void main(String[] args)
    {
        double a, b, c;

        Scanner inp = new Scanner(System.in);

        System.out.print("a= ");
        a = inp.nextDouble();
        System.out.print("b= ");
        b = inp.nextDouble();
        System.out.print("c= ");
        c = inp.nextDouble();

        double operations = a + (b * c) - b;
        System.out.println("Result: " + operations);
    }
}
