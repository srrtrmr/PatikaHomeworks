package week1.technicalContent3;

import java.util.Scanner;

public class Casting
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        // Double => Int
        System.out.print("Enter a double: ");
        double numberDouble = inp.nextDouble();
        int numberInt = (int)numberDouble;

        System.out.println("double as int: " + numberInt);


        // Int => Double
        System.out.print("Enter an int: ");
        numberInt = inp.nextInt();
        numberDouble = (double)numberInt;

        System.out.println("int as double: " + numberDouble);
    }
}
