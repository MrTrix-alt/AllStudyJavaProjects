package learning.java.streamapi.base;

import java.util.stream.IntStream;

public class IntroductionInStreamAPI
{

    public static void main(String[] args)
    {
        // Применение Stream API к массиву:
        // 1) Классический способ:
        int[] arr = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 };
        int count = checkPositiveNumberInArray(arr);
        System.out.println("Количество положительных элементов в массиве: " + count);
        // 2) Способ с применением Stream API:
        long count1 = checkNumbersInArray(arr);
        System.out.println("Количество положительных элементов в массиве: " + count1);

    }

    private static int checkPositiveNumberInArray(int[] arr)
    {
        System.out.println("Классический способ:");
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                count++;
            }
        }
        return count;
    }

    private static long checkNumbersInArray(int[] arr)
    {
        System.out.println("Применение Stream API:");
        return IntStream.of(arr)
                .filter(i -> i > 0)
                .count();
    }
}
