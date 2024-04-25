package week1;

import java.util.Scanner;

public class GroceryCashier
{
    public static void main(String[] args)
    {
        double pearWeight, appleWeight, tomatoesWeight, bananaWeight, eggplantWeight;

        final double pearPrice = 2.14 , applePrice = 3.67, tomatoesPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5.00;

        Scanner inp = new Scanner(System.in);
        System.out.println("Pear(kg): ");
        pearWeight = inp.nextDouble();
        System.out.println("Apple(kg): ");
        appleWeight = inp.nextDouble();
        System.out.println("Tomatoes(kg): ");
        tomatoesWeight = inp.nextDouble();
        System.out.println("Banana(kg): ");
        bananaWeight = inp.nextDouble();
        System.out.println("Eggplant(kg): ");
        eggplantWeight = inp.nextDouble();

        double totalPrice = (pearPrice * pearWeight) +
                (applePrice * appleWeight) +
                (tomatoesPrice * tomatoesWeight) +
                (bananaPrice * bananaWeight) +
                (eggplantPrice * eggplantWeight);

        System.out.println("Total price: " + totalPrice + " TL");
    }
}
