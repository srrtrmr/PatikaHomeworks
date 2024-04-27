package week1.technicalContent2;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        int operand1, operand2;
        byte operator;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter first number: ");
        operand1 = inp.nextInt();
        System.out.print("Enter second number: ");
        operand2 = inp.nextInt();

        System.out.println("1-Add\n2-Extract\n3-Divide\n4-Multiply");
        System.out.print("Select operator as number: ");
        operator = inp.nextByte();

        switch (operator)
        {
            case 1:
                System.out.println("Total: " + (operand1 + operand2));
                break;
            case 2:
                System.out.println("Extraction: " + (operand1 - operand2));
                break;
            case 3:
                switch (operand2)
                {
                    case 0 -> System.out.println("Divisor could not be 0.");
                    default -> System.out.println("Division: " + (operand1 / operand2));
                }
                break;
            case 4:
                System.out.println("Multiplication: " + (operand1 * operand2));
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}
