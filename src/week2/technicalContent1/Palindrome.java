package week2.technicalContent1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inp.nextInt();

        boolean result = isPalindrome(number);

        if (result)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }

    public static boolean isPalindrome(int integer)
    {
        int palindrome = integer;
        int reverse = 0;

        while (palindrome != 0)
        {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
            System.out.println();
        }

        return integer == reverse;
    }
}
