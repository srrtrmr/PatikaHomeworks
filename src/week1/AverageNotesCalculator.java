package week1;

import java.util.Scanner;

public class AverageNotesCalculator
{
    public static void main(String[] args)
    {
        int mat, phys, chem, trk, music, history;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter mathematics note: ");
        mat = inp.nextInt();

        System.out.print("Enter physics note: ");
        phys = inp.nextInt();

        System.out.print("Enter chemistry note: ");
        chem = inp.nextInt();

        System.out.print("Enter turkish note: ");
        trk = inp.nextInt();

        System.out.print("Enter music note: ");
        music = inp.nextInt();

        System.out.print("Enter history note: ");
        history = inp.nextInt();

        int sum = mat + phys + chem + trk + music +  history;
        double average = sum / 6.0;

        System.out.println("Average: " + average);

        //if (average > 60)
        //{
        //    System.out.println("Passed");
        //}
        //else
        //{
        //    System.out.println("Failed");
        //}

        String result;

        result = (average > 60) ? "Passed": "Failed";

        System.out.println(result);
    }
}
