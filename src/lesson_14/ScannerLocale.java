package lesson_14;

import java.util.Locale;
import java.util.Scanner;

public class ScannerLocale {
    public static void main(String[] args) {
        String data = "3.14 Java 42,7";
        Scanner sc = new Scanner(data);

        sc.useLocale(Locale.US);

        System.out.println(sc.nextDouble());
        System.out.println(sc.next()); // этот метод читает только один токен, возвращает строку

        sc.useLocale(Locale.GERMANY);

        System.out.println(sc.nextDouble());
    }
}
