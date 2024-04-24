package week1;

import java.util.Scanner;

public class TaximeterCalculator
{
    public static void main(String[] args)
    {
        double km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        km = input.nextDouble();

        total = km * perKm;
        total += startPrice;

        total = ( total < 20 ) ? 20 : total;
        System.out.print("Total price: " + total);
    }
}
