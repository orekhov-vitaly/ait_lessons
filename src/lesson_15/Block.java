package lesson_15;

public class Block {
    public static void main(String[] args) {
        // Блок или составной оператор {} - произвольное количество простых операторов Java, заключенных в фигурные скобки. Блоки могут быть вложенны один в другой.
        // Scope - область видимости - часть программы, в которой переменная доступна для использования
        // Облать видимости определяется фигурными скобками

        int x = 10;

        {
            int y = 5;
            x = x + y;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
//        x = x + y;
    }
}
