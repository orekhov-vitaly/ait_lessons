package lesson_13;

public class CharExample {
    public static void main(String[] args) {
        // Тип данных char

        // Символ пишется в одинарных кавычках
        char a = 'A'; // Переменная будет хранить букву A латинского алфавита
        System.out.println("a: " + a);
        char a1 = 65; // Переменная тоже будет хранить букву A латинского алфавита
        System.out.println("a1: " + a1);
        char a2 = 0x41; // Присваиваем число в 16-ом формате. Соответствует числу 65 в 10-ом формате и соответствует букве А
        //char a2 = 0x0041; // Полная форма записи с 10-ом формате
        System.out.println("a2: " + a2);
        char a3 = '\u0041';
        System.out.println("a3: " + a3);

        char digit = 48;
        System.out.println("digit: " + digit);
        digit++;
        System.out.println("digit++: " + digit);
        digit+=4;
        System.out.println("digit + 4: " + digit);

        char letter = 97;



    }
}
