package lesson_23;

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat(); // Создпние объекта класса Cat
        /*
        1. Физически в памяти 0создается объект типа Cat.
        2. Вызывается конструктор класса.
        3. Поля объекта заполняются значениями.
         */


        /*
        * Присоздании объекта класса все его поля инициализируются какими-то значениями
        * по умолчанию (если не задано другое поведение), поля объекта инициализируются значениями по умолчанию для
        * своего типа данных
        *
        * - для числовых типов - 0 / 0.0
        * - для ссылочных типов - null
        * - boolean - false*/


        cat.sayMeow();
        cat.sleep();
        cat.run();

        String catName = cat.name;
        System.out.println("Имя: " + catName);
        System.out.println("Возраст: " + cat.age);

        System.out.println("=================\n");

        Cat cat1 = new Cat("Max");

        System.out.println("Name" + cat1.name);
        System.out.println("Color" + cat1.color);

        cat.info();
        cat1.info();

        Cat cat2 = new Cat("Diamond", "red");

        cat2.info();

        Cat barsik = new Cat("Barsik", 2, "White");
        barsik.info();

        Cat catClone = barsik;
        catClone.info();
        barsik.age = 100;
        System.out.println("========\n");
        barsik.info();
        catClone.info();

        catClone = new Cat("Kratos", 8, "Black");
        System.out.println("========\n");
        barsik.info();
        catClone.info();

        catClone = null; // Нет привязки к объекту. Null - это ничто.
        System.out.println("========\n");
        barsik.info();
        System.out.println("catClone: " + catClone);

    }
}
