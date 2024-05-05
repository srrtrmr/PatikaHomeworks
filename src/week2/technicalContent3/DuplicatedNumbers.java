package week2.technicalContent3;

import java.util.HashMap;

public class DuplicatedNumbers
{
    public static void main(String[] args)
    {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 12, 13, 14, 15, 15 };

        HashMap<Integer, Integer> duplicates = new HashMap<>();

        for (int number : numbers)
        {
            if (duplicates.containsKey(number))
            {
                duplicates.put(number, duplicates.get(number) + 1);
            }
            else
            {
                duplicates.put(number, 1);
            }
        }

        System.out.println("Duplicated Even Numbers: ");

        for (int number : duplicates.keySet())
        {
            if (duplicates.get(number) > 1 && number % 2 == 0)
            {
                System.out.println(number);
            }
        }
    }
}
