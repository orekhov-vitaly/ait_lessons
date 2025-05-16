package homeworks.homework_20;

import java.util.Arrays;

public class Task3_1 {
    public static void main(String[] args) {
        int[] numbers = {0, 13, -25, 11, 31, 55, 98, 11, 5};

        int[] primeArray = getArrayWithOnlyPrime(numbers);
        System.out.println(Arrays.toString(primeArray));
    }

    private static int[] getArrayWithOnlyPrime(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (isPrime2(numbers[i])) {
                count++;
            }
        }

        if (count == 0) return new int[0];

        int[] result = new int[count];

        for (int i = 0, idxPrime = 0; i < numbers.length && idxPrime < count; i++) {
            if (isPrime2(numbers[i])) {
                result[idxPrime] = numbers[i];
                idxPrime++;
            }
        }

        return result;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrime2(int number) {
        if (number <= 1) return false;

        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        int count = 2;

        for (int i = 5; i * i < number; i += 5) {
            count++;
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }
}
