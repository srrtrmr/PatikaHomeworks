package week1;

import java.util.Scanner;

public class KdvCalculator
{
    public static void main(String[] args)
    {
        double price, kdvRatio = 0, kdvValue, priceWithKdv;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Price: ");
        price = inp.nextDouble();

        if (price < 0)
        {
            System.out.println("Invalid price !");
            return;
        }

        if (price >= 0 && price <= 1000)
        {
            kdvRatio = 0.18;
        }
        else if (price > 1000)
        {
            kdvRatio = 0.08;
        }

        kdvValue = price * kdvRatio;
        priceWithKdv = price + kdvValue;

        System.out.println("Price without KDV: " + price);
        System.out.println("KDV Ratio: " + kdvRatio);
        System.out.println("KDV Value: " + kdvValue);
        System.out.println("Price with KDV: " + priceWithKdv);
    }
}