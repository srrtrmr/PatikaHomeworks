package week1;

import java.util.Scanner;

public class BodyMassIndexCalculator
{
    public static void main(String[] args)
    {
        double height, weight;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your height(m): ");
        height = inp.nextDouble();
        System.out.println("Enter your weight(kg): ");
        weight = inp.nextDouble();

        double bodyMassIndex = weight / (height * height);
        System.out.println("Body mass index: " + bodyMassIndex);
    }
}
