package week2.technicalContent3;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter count: ");
        int count = inp.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++)
        {
            System.out.print("Enter " + (i + 1) + ". Number: ");
            int number = inp.nextInt();

            numbers[i] = number;
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
