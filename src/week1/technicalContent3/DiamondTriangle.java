package week1.technicalContent3;

import java.util.Scanner;

public class DiamondTriangle
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = inp.nextInt();

        for (int m = 1; m <= number; m++) {

            for (int n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            for (int n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int m = number - 1; m > 0; m--) {

            for (int n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            for (int n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
