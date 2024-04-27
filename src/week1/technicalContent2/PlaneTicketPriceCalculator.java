package week1.technicalContent2;

import java.util.Scanner;

public class PlaneTicketPriceCalculator
{
    public static void main(String[] args)
    {
        final byte ONEWAY_TRAVEL = 1, ROUND_TRIP_TRAVEL = 2;
        final double PRICE_PER_KM = 0.10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter distance(km): ");
        int distance = inp.nextInt();

        if (distance < 0)
        {
            System.out.println("Invalid distance");
            return;
        }

        System.out.print("Enter age: ");
        int age = inp.nextInt();

        if (age < 0)
        {
            System.out.println("Invalid age");
            return;
        }

        System.out.print("Enter travel type(1:One way, 2:Round-trip): ");
        int type = inp.nextInt();

        if (type != ONEWAY_TRAVEL && type != ROUND_TRIP_TRAVEL)
        {
            System.out.println("Invalid travel type");
            return;
        }

        if (type == 2)
        {
           distance *= 2;
        }

        double totalPrice = distance * PRICE_PER_KM;

        if (age < 12)
        {
            totalPrice /= 2;
        }
        else if (age < 24)
        {
            totalPrice *= 0.9;
        }
        else if (age > 65)
        {
            totalPrice *= 0.7;
        }

        if (type == ROUND_TRIP_TRAVEL)
        {
            totalPrice *= 0.8;
        }

        System.out.println("Total price: " + totalPrice);
    }
}
