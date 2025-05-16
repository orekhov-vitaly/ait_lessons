package homeworks.homework_17;

/*Task 4 *(Опционально)
Напишите программу, которая просит пользователя ввести слово "hello". Если пользователь вводит правильное слово, программа благодарит его и завершает работу. Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.

Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова, и выведите это количество на экран.*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        String str;

        do {
            System.out.println("Введите слово \"hello\": ");
            str = scanner.nextLine();
            if (str.equals("hello")) System.out.println("Вы правильно ввели слово!\nКоличество попыток: " + count);
            else System.out.println("Неверно ((");
            count++;
        } while(!str.equals("hello"));
    }
}

