package week1.technicalContent3;

import java.util.Scanner;

public class EBOB_EKOK
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstInput = inp.nextInt();
        System.out.print("Enter second number: ");
        int secondInput = inp.nextInt();

        // EBOB
        int firstNumber = firstInput;
        int secondNumber = secondInput;

        while (firstNumber != secondNumber)
        {
            if (firstNumber > secondNumber)
                firstNumber -= secondNumber;
            else
                secondNumber -= firstNumber;
        }

        System.out.println("EBOB: " + secondNumber);

        // EKOK
        firstNumber = firstInput;
        secondNumber = secondInput;

        int lcm = Math.max(firstNumber, secondNumber);

        while (lcm % firstNumber != 0 || lcm % secondNumber != 0)
        {
            ++lcm;
        }

        System.out.print("EKOK: " + lcm);
    }
}
