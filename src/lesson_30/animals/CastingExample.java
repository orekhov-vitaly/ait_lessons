package lesson_30.animals;

/*
* Кастинг бывает двух видов:
*
* - Восходящее преобразование (upcasting)
* - Нисходящее преобразование (downcasting)
* */

public class CastingExample {
    public static void main(String[] args) {

        // Восходящее преобразование происходит автоматически
        Animal animal = new Cat();

        animal.voice();
        // animal.eat(); // Не доступен, так как метод отсутствует у типа Animal

        Animal animal2 = new Hamster();

        animal2.voice();

        System.out.println("============\n");

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal2;
        animals[2] = new Dog();

        testAnimals(new Cat());
        testAnimals(new Dog());
        testAnimals(new Hamster());
    }

    public static void testAnimals(Animal animal) {
        animal.voice();
    }
}
