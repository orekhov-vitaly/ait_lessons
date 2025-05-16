package homeworks.homework_14;

/*Task 4 * (Опционально)
Дан следующий код. Вашей задачей является предсказать, какой вывод будет напечатан в консоли после выполнения программы.

Предсказать = бнз запуска кода на выполнение, сказать, какой вывод в консоли вы увидите

public class BooleanTest {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);  true

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);  true

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);  false

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);  true

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);  false
    }
}
Copy
Предскажите, что будет выведено на консоль. Объясните кратко свой ответ.*/

public class Task4 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);  // true

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);  // true

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);  // false

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);  // true

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);  // false
    }
}
