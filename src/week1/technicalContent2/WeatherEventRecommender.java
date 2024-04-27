package week1.technicalContent2;

import java.util.Scanner;

public class WeatherEventRecommender
{
    public static void main(String[] args)
    {
        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter heat: ");
        heat = inp.nextInt();

        if(heat > -30 && heat < 5)
        {
            System.out.println("Ski time!");
        }
        else if (heat >= 5 && heat < 15)
        {
            System.out.println("Cinema time!");
        }
        else if (heat >= 15 && heat < 25)
        {
            System.out.println("Picnic time!");
        }
        else if (heat >= 25 && heat < 50)
        {
            System.out.println("Swimming time!");
        }
        else
        {
            System.out.println("Stay at home!");
        }
    }
}
