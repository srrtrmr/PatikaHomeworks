package week1.technicalContent2;

import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args)
    {
        int mat, phys, chem, trk, music, sum = 0, count = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter mathematics grade: ");
        mat = inp.nextInt();

        if (mat >= 0 && mat <= 100)
        {
            sum += mat;
            count++;
        }

        System.out.print("Enter physics grade: ");
        phys = inp.nextInt();

        if (phys >= 0 && phys <= 100)
        {
            sum += phys;
            count++;
        }

        System.out.print("Enter chemistry grade: ");
        chem = inp.nextInt();

        if (chem >= 0 && chem <= 100)
        {
            sum += chem;
            count++;
        }

        System.out.print("Enter turkish grade: ");
        trk = inp.nextInt();

        if (trk >= 0 && trk <= 100)
        {
            sum += trk;
            count++;
        }

        System.out.print("Enter music grade: ");
        music = inp.nextInt();

        if (music >= 0 && music <= 100)
        {
            sum += music;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("Average grade: " + average);

        String result = (average <= 55) ? "Failed": "Passed";

        System.out.println(result);
    }
}
