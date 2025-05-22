package lesson_26;

/*
Статические члены класса имеют доступ (видят) только статический контент
*/

public class StaticExample {

    // non-static поле класса
    int x;

    // static поле класса
    static int staticY;

    // Статический метод
    public static void staticMethod() {
        // Статические методы видят ТОЛЬКО статические члены класса
        // x++; Нет доступа к не-статическому полю
        staticY++; // Доступ к статическому полю есть

        // Можем вызывать только статические методы
        // nonStaticMethod();

        // Кючевое слово this не доступно в static-методах
        // this.x;

        // В статическом методе можно вызывать другие статические методы
    }

    // Не статический метод
    public void nonStaticMethod() {
        // У нестатического метода есть доступ ко ВСЕМ членам класса
        x++; // не-статика доступна
        staticY++;
        // Можем вызывать статические и нестатические методы класса
        staticMethod();
    }

    public static void main(String[] args) {
        // x = 10; // Ошибка компеяции

        staticY = 10;
        System.out.println(staticY);

        // nonStaticMethod(); нельзя вызывать нестатический метод
        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticMethod(); // Я могу вызвать нестатический метод, только использую ссылку на объект

        // Я могу вызвать статический метод БЕЗ создания объекта
        StaticExample.staticMethod();

        int sum = MathUtil.sumIntegers(1, 2, 3, 4, 5, 6, 7);
        System.out.println(sum);
    }
}