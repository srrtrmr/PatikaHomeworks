package week1;

import java.util.Scanner;

public class CircleAreaCalculator
{
    public static void main(String[] args)
    {
        double radius, alpha;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        radius = inp.nextDouble();
        System.out.print("Enter circle center angle: ");
        alpha = inp.nextDouble();

        double circleArea          = Math.PI * radius * radius;
        double circleCircumference = 2 * Math.PI * radius;
        double partialCircleArea   = circleArea * alpha / 360.0;

        System.out.println("Total circle area: " + circleArea);
        System.out.println("Total circle circumference: " + circleCircumference);
        System.out.println("Partial circle area: " + partialCircleArea);
    }
}
