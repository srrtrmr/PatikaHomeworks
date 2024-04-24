package week1;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args)
    {
        double firstSideLength, secondSideLength, thirdSideLength;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first side length: ");
        firstSideLength = inp.nextDouble();

        System.out.print("Enter second side length: ");
        secondSideLength = inp.nextDouble();

        System.out.print("Enter third side length: ");
        thirdSideLength = inp.nextDouble();

        double u = (firstSideLength + secondSideLength + thirdSideLength) / 2.0;

        double areaSquare = u * (u - firstSideLength) * (u - secondSideLength) * (u - thirdSideLength);

        double area = Math.sqrt(areaSquare);

        System.out.println("Triangle area: " + area);
    }
}
