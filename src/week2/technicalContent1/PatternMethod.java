package week2.technicalContent1;

import java.util.Scanner;

public class PatternMethod
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = inp.nextInt();

        printPattern(number);

    }

    public static void printPattern(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        printPattern(n - 5);
        System.out.print(n + " ");
    }
}
