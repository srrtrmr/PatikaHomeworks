package week2.technicalContent3;
import java.util.Arrays;

    public class HarmonicAverage
    {
        public static void main(String[] args)
        {
            int[] numbers = {1, 2, 3, 4, 5};
            double sum = 0;

            //for (int i = 0; i < numbers.length; i++) {
            //    sum += 1.0 / numbers[i];
            //}

            for (int number : numbers)
            {
                sum += 1.0 / number;
            }

            System.out.println(Arrays.toString(numbers));
            System.out.println("Harmonic Average: " + numbers.length / sum);
        }
    }

