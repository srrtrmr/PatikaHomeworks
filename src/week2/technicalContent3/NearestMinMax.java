package week2.technicalContent3;

import java.util.Arrays;

public class NearestMinMax
{
    public static void main(String[] args)
    {
        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};

        int target = 5;

        Arrays.sort(numbers);

        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int num : numbers)
        {
            if (num < target)
            {
                closestSmaller = Math.max(closestSmaller, num);
            }
            else if (num > target)
            {
                closestLarger = Math.min(closestLarger, num);
                break;
            }
        }

        System.out.println("Closest Smaller: " + closestSmaller);
        System.out.println("Closest Larger: " + closestLarger);
    }
}
