package lesson_18;

import java.util.Random;

public class ForExample {
    public static void main(String[] args) {
        /*
        for (<Блок инициализации> ;<Блок проверок / условие выхода> ;<Блок изменений> ) {
            // Тело цикла
        }
         */

        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }

        for (String str = "hello"; str.length() <= 10; str += "!") {
            System.out.println(str);
        }
        System.out.println("=========\n");

        int m = 14;
        for (int a = 0, f = 1 ;m >= 0 && f < 10 ;m--, a = ++a + m, f++ ) {
            System.out.println(m + " : " + a + " : " + f);
        }
        System.out.println("=========\n");

        Random random = new Random();

        int length = random.nextInt(11) + 5;
        int[] digits = new int[length];
        System.out.print("[");
        for (int k = 0; k < length; k++) {
            digits[k] = random.nextInt(101) - 50;
            System.out.print(digits[k] + ", ");
        }
        System.out.print("]");
    }
}
